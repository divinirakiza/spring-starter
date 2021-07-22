package com.java.main.springstarter.v1.utils;

public class ConstantsUtility {
    /**
     * Default Pagination Page Number
     */
    public String DEFAULT_PAGE_NUMBER = "0";


    /**
     * Default Pagination Page Size
     */
    public String DEFAULT_PAGE_SIZE = "100";


    /**
     * Maximum Page Size
     */
    public int MAX_PAGE_SIZE = 1000;


    /**
     * Validate Request Page Number and Page Size
     * @param pageNumber Page Number
     * @param pageSize Page Size
     */
    public static void validatePageNumberAndSize(int pageNumber, int pageSize) {
        if (pageNumber < 0) {
            throw new BadRequestException("Page number is less than zero.");
        }

        if (pageSize > ConstantsUtility.MAX_PAGE_SIZE) {
            throw new BadRequestException("Page size is greater than " + ConstantsUtility.MAX_PAGE_SIZE);
        }
    }
}
