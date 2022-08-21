
package com.example.reccardview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Model {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("subjects")
    @Expose
    private List<String> subjects = null;
    @SerializedName("qualification")
    @Expose
    private List<String> qualification = null;
    @SerializedName("profileImage")
    @Expose
    private String profileImage;

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public List<String> getSubjects()
    {
        return subjects;
    }
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
    public List<String> getQualification() {
        return qualification;
    }
    public void setQualification(List<String> qualification) {
        this.qualification = qualification;
    }
    public String getProfileImage() {
        return profileImage;
    }
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
