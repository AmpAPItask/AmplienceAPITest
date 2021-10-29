
package com.amplience.pages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Datum {

    @SerializedName("srcName")
    @Expose
    private String srcName;
    @SerializedName("workflow")
    @Expose
    private Workflow workflow;
    @SerializedName("revisionNumber")
    @Expose
    private Long revisionNumber;
    @SerializedName("revertible")
    @Expose
    private Boolean revertible;
    @SerializedName("bucketID")
    @Expose
    private String bucketID;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("mimeType")
    @Expose
    private String mimeType;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("userID")
    @Expose
    private String userID;
    @SerializedName("thumbFile")
    @Expose
    private String thumbFile;
    @SerializedName("folderID")
    @Expose
    private String folderID;
    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("createdDate")
    @Expose
    private Long createdDate;
    @SerializedName("contents")
    @Expose
    private List<Object> contents = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("subType")
    @Expose
    private Object subType;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("thumbURL")
    @Expose
    private String thumbURL;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("changeSummary")
    @Expose
    private List<String> changeSummary = null;
    @SerializedName("publishStatus")
    @Expose
    private String publishStatus;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param srcName
     * @param workflow
     * @param revisionNumber
     * @param revertible
     * @param bucketID
     * @param label
     * @param mimeType
     * @param type
     * @param userID
     * @param thumbFile
     * @param folderID
     * @param file
     * @param createdDate
     * @param contents
     * @param name
     * @param subType
     * @param id
     * @param thumbURL
     * @param user
     * @param changeSummary
     * @param publishStatus
     * @param status
     * @param timestamp
     */
    public Datum(String srcName, Workflow workflow, Long revisionNumber, Boolean revertible, String bucketID, String label, String mimeType, String type, String userID, String thumbFile, String folderID, String file, Long createdDate, List<Object> contents, String name, Object subType, String id, String thumbURL, String user, List<String> changeSummary, String publishStatus, String status, Long timestamp) {
        super();
        this.srcName = srcName;
        this.workflow = workflow;
        this.revisionNumber = revisionNumber;
        this.revertible = revertible;
        this.bucketID = bucketID;
        this.label = label;
        this.mimeType = mimeType;
        this.type = type;
        this.userID = userID;
        this.thumbFile = thumbFile;
        this.folderID = folderID;
        this.file = file;
        this.createdDate = createdDate;
        this.contents = contents;
        this.name = name;
        this.subType = subType;
        this.id = id;
        this.thumbURL = thumbURL;
        this.user = user;
        this.changeSummary = changeSummary;
        this.publishStatus = publishStatus;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    public Long getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(Long revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public Boolean getRevertible() {
        return revertible;
    }

    public void setRevertible(Boolean revertible) {
        this.revertible = revertible;
    }

    public String getBucketID() {
        return bucketID;
    }

    public void setBucketID(String bucketID) {
        this.bucketID = bucketID;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getThumbFile() {
        return thumbFile;
    }

    public void setThumbFile(String thumbFile) {
        this.thumbFile = thumbFile;
    }

    public String getFolderID() {
        return folderID;
    }

    public void setFolderID(String folderID) {
        this.folderID = folderID;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public List<Object> getContents() {
        return contents;
    }

    public void setContents(List<Object> contents) {
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getSubType() {
        return subType;
    }

    public void setSubType(Object subType) {
        this.subType = subType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThumbURL() {
        return thumbURL;
    }

    public void setThumbURL(String thumbURL) {
        this.thumbURL = thumbURL;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<String> getChangeSummary() {
        return changeSummary;
    }

    public void setChangeSummary(List<String> changeSummary) {
        this.changeSummary = changeSummary;
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("srcName");
        sb.append('=');
        sb.append(((this.srcName == null)?"<null>":this.srcName));
        sb.append(',');
        sb.append("workflow");
        sb.append('=');
        sb.append(((this.workflow == null)?"<null>":this.workflow));
        sb.append(',');
        sb.append("revisionNumber");
        sb.append('=');
        sb.append(((this.revisionNumber == null)?"<null>":this.revisionNumber));
        sb.append(',');
        sb.append("revertible");
        sb.append('=');
        sb.append(((this.revertible == null)?"<null>":this.revertible));
        sb.append(',');
        sb.append("bucketID");
        sb.append('=');
        sb.append(((this.bucketID == null)?"<null>":this.bucketID));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("mimeType");
        sb.append('=');
        sb.append(((this.mimeType == null)?"<null>":this.mimeType));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("userID");
        sb.append('=');
        sb.append(((this.userID == null)?"<null>":this.userID));
        sb.append(',');
        sb.append("thumbFile");
        sb.append('=');
        sb.append(((this.thumbFile == null)?"<null>":this.thumbFile));
        sb.append(',');
        sb.append("folderID");
        sb.append('=');
        sb.append(((this.folderID == null)?"<null>":this.folderID));
        sb.append(',');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("contents");
        sb.append('=');
        sb.append(((this.contents == null)?"<null>":this.contents));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("subType");
        sb.append('=');
        sb.append(((this.subType == null)?"<null>":this.subType));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("thumbURL");
        sb.append('=');
        sb.append(((this.thumbURL == null)?"<null>":this.thumbURL));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("changeSummary");
        sb.append('=');
        sb.append(((this.changeSummary == null)?"<null>":this.changeSummary));
        sb.append(',');
        sb.append("publishStatus");
        sb.append('=');
        sb.append(((this.publishStatus == null)?"<null>":this.publishStatus));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
