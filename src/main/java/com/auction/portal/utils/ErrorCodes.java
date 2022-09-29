package com.auction.portal.utils;

public class ErrorCodes {

    public static final String USER_NOT_FOUND = "USER NOT FOUND!";
    public static final String EMAIL_ALREADY_REGISTERED = "EMAIL ALREADY REGISTERED WITH ANOTHER USER!";
    public static final String EMAIL_INVALID = "EMAIL INVALID, PLEASE GIVE A VALID EMAIL";
    public static final String PASSWORD_INVALID = "PASSWORD NOT IN THE GIVEN FORMAT!";
    public static final String FORBIDDEN = "USER IS FORBIDDEN TO ACCESS THIS FEATURE";
    public static final String NOT_NULLABLE = "FIELD CANNOT BE NULL";
    public static final String BID_MINVALUE_REQUIRED = "PROVIDED VALUE IS LESS THAN MINIMUM VALUE FOR BIDDING";
    public static final String IMAGE_SIZE_EXCEEDED = "MAXIMUM IMAGE SIZE ALLOWED IS 2MB";
    public static final String EXP_DATE_MIN_1DAY = "EXPIRY DATE SHOULD BE MINIMUM 1 DAY FROM CURRENT DATE";
    public static final String PRICE_ALREADY_BID = "CURRENT PRICE IS ALREADY BID FOR THE AUCTION";
    public static final String BID_LESS_THAN_CURRENT_BID = "CANNOT BID SAME VALUE, PRICE ALREADY BID";
    public static final String NOT_VALID="INTERNAL_SERVER_ERROR";
}
