package com;

import javax.persistence.*;

@Entity
@Table(name = "voteinfo", schema = "onlinevote")
public class VoteinfoEntity {
    private String imgName;
    private String imgPath;
    private String optName;
    private Integer voteNum;

    @Id
    @Column(name = "imgName", nullable = false, length = 255)
    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    @Basic
    @Column(name = "imgPath", nullable = true, length = 255)
    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Basic
    @Column(name = "optName", nullable = true, length = 255)
    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName;
    }

    @Basic
    @Column(name = "voteNum", nullable = true)
    public Integer getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(Integer voteNum) {
        this.voteNum = voteNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoteinfoEntity that = (VoteinfoEntity) o;

        if (imgName != null ? !imgName.equals(that.imgName) : that.imgName != null) return false;
        if (imgPath != null ? !imgPath.equals(that.imgPath) : that.imgPath != null) return false;
        if (optName != null ? !optName.equals(that.optName) : that.optName != null) return false;
        if (voteNum != null ? !voteNum.equals(that.voteNum) : that.voteNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imgName != null ? imgName.hashCode() : 0;
        result = 31 * result + (imgPath != null ? imgPath.hashCode() : 0);
        result = 31 * result + (optName != null ? optName.hashCode() : 0);
        result = 31 * result + (voteNum != null ? voteNum.hashCode() : 0);
        return result;
    }
}
