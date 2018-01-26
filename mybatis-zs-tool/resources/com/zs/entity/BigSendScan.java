package com.zs.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BigSendScan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.ID
     *
     * @mbggenerated
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.BIG_NO
     *
     * @mbggenerated
     */
    private String bigNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.SCAN_TIME
     *
     * @mbggenerated
     */
    private Date scanTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.NEXT_POINT_CODE
     *
     * @mbggenerated
     */
    private String nextPointCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.NEXT_POINT_NAME
     *
     * @mbggenerated
     */
    private String nextPointName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.MAN_NO
     *
     * @mbggenerated
     */
    private String manNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.MAN_NAME
     *
     * @mbggenerated
     */
    private String manName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.IS_DELETE
     *
     * @mbggenerated
     */
    private BigDecimal isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BIG_SEND_SCAN.DATE_TIME
     *
     * @mbggenerated
     */
    private Date dateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.ID
     *
     * @return the value of BIG_SEND_SCAN.ID
     *
     * @mbggenerated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.ID
     *
     * @param id the value for BIG_SEND_SCAN.ID
     *
     * @mbggenerated
     */
    public BigSendScan setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.BIG_NO
     *
     * @return the value of BIG_SEND_SCAN.BIG_NO
     *
     * @mbggenerated
     */
    public String getBigNo() {
        return bigNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.BIG_NO
     *
     * @param bigNo the value for BIG_SEND_SCAN.BIG_NO
     *
     * @mbggenerated
     */
    public BigSendScan setBigNo(String bigNo) {
        this.bigNo = bigNo == null ? null : bigNo.trim();
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.SCAN_TIME
     *
     * @return the value of BIG_SEND_SCAN.SCAN_TIME
     *
     * @mbggenerated
     */
    public Date getScanTime() {
        return scanTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.SCAN_TIME
     *
     * @param scanTime the value for BIG_SEND_SCAN.SCAN_TIME
     *
     * @mbggenerated
     */
    public BigSendScan setScanTime(Date scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.NEXT_POINT_CODE
     *
     * @return the value of BIG_SEND_SCAN.NEXT_POINT_CODE
     *
     * @mbggenerated
     */
    public String getNextPointCode() {
        return nextPointCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.NEXT_POINT_CODE
     *
     * @param nextPointCode the value for BIG_SEND_SCAN.NEXT_POINT_CODE
     *
     * @mbggenerated
     */
    public BigSendScan setNextPointCode(String nextPointCode) {
        this.nextPointCode = nextPointCode == null ? null : nextPointCode.trim();
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.NEXT_POINT_NAME
     *
     * @return the value of BIG_SEND_SCAN.NEXT_POINT_NAME
     *
     * @mbggenerated
     */
    public String getNextPointName() {
        return nextPointName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.NEXT_POINT_NAME
     *
     * @param nextPointName the value for BIG_SEND_SCAN.NEXT_POINT_NAME
     *
     * @mbggenerated
     */
    public BigSendScan setNextPointName(String nextPointName) {
        this.nextPointName = nextPointName == null ? null : nextPointName.trim();
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.MAN_NO
     *
     * @return the value of BIG_SEND_SCAN.MAN_NO
     *
     * @mbggenerated
     */
    public String getManNo() {
        return manNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.MAN_NO
     *
     * @param manNo the value for BIG_SEND_SCAN.MAN_NO
     *
     * @mbggenerated
     */
    public BigSendScan setManNo(String manNo) {
        this.manNo = manNo == null ? null : manNo.trim();
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.MAN_NAME
     *
     * @return the value of BIG_SEND_SCAN.MAN_NAME
     *
     * @mbggenerated
     */
    public String getManName() {
        return manName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.MAN_NAME
     *
     * @param manName the value for BIG_SEND_SCAN.MAN_NAME
     *
     * @mbggenerated
     */
    public BigSendScan setManName(String manName) {
        this.manName = manName == null ? null : manName.trim();
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.IS_DELETE
     *
     * @return the value of BIG_SEND_SCAN.IS_DELETE
     *
     * @mbggenerated
     */
    public BigDecimal getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.IS_DELETE
     *
     * @param isDelete the value for BIG_SEND_SCAN.IS_DELETE
     *
     * @mbggenerated
     */
    public BigSendScan setIsDelete(BigDecimal isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BIG_SEND_SCAN.DATE_TIME
     *
     * @return the value of BIG_SEND_SCAN.DATE_TIME
     *
     * @mbggenerated
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BIG_SEND_SCAN.DATE_TIME
     *
     * @param dateTime the value for BIG_SEND_SCAN.DATE_TIME
     *
     * @mbggenerated
     */
    public BigSendScan setDateTime(Date dateTime) {
        this.dateTime = dateTime;
        return this;
    }
}
