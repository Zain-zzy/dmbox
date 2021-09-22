package com.zkzy.portal.base.admin.api.entity;

import java.io.Serializable;
import java.util.Date;

public class SystemNodefile implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.ID
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.BASENAME
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private String basename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.FILEURL
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private String fileurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.PARENT_ID
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.CREATER
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.MODIFYER
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private String modifyer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.CREATEDATE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.UPDATEDATE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private Date updatedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.SIZE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    private String fsize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.PDFPATH
     *
     * @mbggenerated Mon Jul 24 13:18:20 CST 2017
     */
    private String pdfpath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.FILETYPE
     *
     * @mbggenerated Mon Jul 24 13:18:20 CST 2017
     */
    private String filetype;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_NODEFILE.STATUS
     *
     * @mbggenerated Tue Jul 25 11:18:36 CST 2017
     */
    private String status;


    private String ittype;


    public String getFsize() {
        return fsize;
    }

    public void setFsize(String fsize) {
        this.fsize = fsize;
    }

    public String getIttype() {
        return ittype;
    }

    public void setIttype(String ittype) {
        this.ittype = ittype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.ID
     *
     * @return the value of SYSTEM_NODEFILE.ID
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.ID
     *
     * @param id the value for SYSTEM_NODEFILE.ID
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.BASENAME
     *
     * @return the value of SYSTEM_NODEFILE.BASENAME
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public String getBasename() {
        return basename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.BASENAME
     *
     * @param basename the value for SYSTEM_NODEFILE.BASENAME
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setBasename(String basename) {
        this.basename = basename == null ? null : basename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.FILEURL
     *
     * @return the value of SYSTEM_NODEFILE.FILEURL
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public String getFileurl() {
        return fileurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.FILEURL
     *
     * @param fileurl the value for SYSTEM_NODEFILE.FILEURL
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.PARENT_ID
     *
     * @return the value of SYSTEM_NODEFILE.PARENT_ID
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.PARENT_ID
     *
     * @param parentId the value for SYSTEM_NODEFILE.PARENT_ID
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.CREATER
     *
     * @return the value of SYSTEM_NODEFILE.CREATER
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.CREATER
     *
     * @param creater the value for SYSTEM_NODEFILE.CREATER
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.MODIFYER
     *
     * @return the value of SYSTEM_NODEFILE.MODIFYER
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public String getModifyer() {
        return modifyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.MODIFYER
     *
     * @param modifyer the value for SYSTEM_NODEFILE.MODIFYER
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setModifyer(String modifyer) {
        this.modifyer = modifyer == null ? null : modifyer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.CREATEDATE
     *
     * @return the value of SYSTEM_NODEFILE.CREATEDATE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.CREATEDATE
     *
     * @param createdate the value for SYSTEM_NODEFILE.CREATEDATE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.UPDATEDATE
     *
     * @return the value of SYSTEM_NODEFILE.UPDATEDATE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.UPDATEDATE
     *
     * @param updatedate the value for SYSTEM_NODEFILE.UPDATEDATE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.SIZE
     *
     * @return the value of SYSTEM_NODEFILE.SIZE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public String getSize() {
        return fsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.SIZE
     *
     * @param size the value for SYSTEM_NODEFILE.SIZE
     *
     * @mbggenerated Thu Jul 20 08:34:36 CST 2017
     */
    public void setSize(String size) {
        this.fsize = size == null ? null : size.trim();
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.PDFPATH
     *
     * @return the value of SYSTEM_NODEFILE.PDFPATH
     *
     * @mbggenerated Mon Jul 24 13:18:20 CST 2017
     */
    public String getPdfpath() {
        return pdfpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.PDFPATH
     *
     * @param pdfpath the value for SYSTEM_NODEFILE.PDFPATH
     *
     * @mbggenerated Mon Jul 24 13:18:20 CST 2017
     */
    public void setPdfpath(String pdfpath) {
        this.pdfpath = pdfpath == null ? null : pdfpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.FILETYPE
     *
     * @return the value of SYSTEM_NODEFILE.FILETYPE
     *
     * @mbggenerated Mon Jul 24 13:18:20 CST 2017
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.FILETYPE
     *
     * @param filetype the value for SYSTEM_NODEFILE.FILETYPE
     *
     * @mbggenerated Mon Jul 24 13:18:20 CST 2017
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_NODEFILE.STATUS
     *
     * @return the value of SYSTEM_NODEFILE.STATUS
     *
     * @mbggenerated Tue Jul 25 11:18:36 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_NODEFILE.STATUS
     *
     * @param status the value for SYSTEM_NODEFILE.STATUS
     *
     * @mbggenerated Tue Jul 25 11:18:36 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}