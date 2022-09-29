package com.auction.portal.utils;

import com.mashape.unirest.http.exceptions.UnirestException;
import io.github.resilience4j.retry.annotation.Retry;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.client.RestTemplate;

/**
 * author @Dhinesh
 * currency conversion
 */
public class CurrencyConvertion {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${apikey}")
     private static String apiKey;

    /**
     * @param currency
     * @param quantity
     * @return currencyToUser value
     * @throws UnirestException
     */
    @Cacheable(key = "#currency" , value = "conversionRate" )
    @Retry(name="CurrencyToUser", fallbackMethod = "convertionFallback")
    public Double convertIntoUser(String currency, int quantity) throws UnirestException {
            String fromTo = "INR_" + currency;
            String s = restTemplate.getForObject("https://free.currconv.com/api/v7/convert?q=" + fromTo + "," + fromTo + "&compact=ultra&apiKey=" + apiKey,
                    String.class);
            JSONObject jsonObject = new JSONObject(s);
            double conversionRate = jsonObject.getDouble(fromTo);
            return conversionRate * quantity;
    }

    /**
     * @param currency
     * @param quantity
     * @return currencyToBase value
     * @throws UnirestException
     */
    @Cacheable(key = "#currency" , value = "conversionRate" )
    @Retry(name="CurrencyToBase", fallbackMethod = "convertionFallback")
    public Double convertIntoBase(String currency, int quantity) throws UnirestException {
        String fromTo =  currency+"_INR";
        String s = restTemplate.getForObject("https://free.currconv.com/api/v7/convert?q=" + fromTo + "," + fromTo + "&compact=ultra&apiKey=" + apiKey,
                String.class);
        JSONObject jsonObject = new JSONObject(s);
        double conversionRate = jsonObject.getDouble(fromTo);
        return conversionRate * quantity;
    }

    /**
     * @param currency, @param quantity
     * returns fallback value
     */
    public Double convertionFallback(String currency, int quantity){
        return 1d;
    }
}