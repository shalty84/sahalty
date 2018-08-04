package com.shalty.technicaltestdigitalturbine.types;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "ads", strict = false)
public class Ad {

    @Element(name="productName")
    private String productName;
    @Element(name="productThumbnail")
    private String productThumbnail;
    @Element(name="productDescription")
    private String productDescription;
    @Element(name="rating")
    private String rating;
    @Element(name="appId")
    private String appId;
    @Element(name="averageRatingImageURL")
    private String averageRatingImageURL;
    @Element(name="bidRate")
    private String bidRate;
    @Element(name="ratbillingTypeIding")
    private String billingTypeId;
    @Element(name="callToAction")
    private String callToAction;

    @Element(name="campaignDisplayOrder")
    private String campaignDisplayOrder;
    @Element(name="campaignId")
    private String campaignId;
    @Element(name="campaignTypeId")
    private String campaignTypeId;
    @Element(name="categoryName")
    private String categoryName;
    @Element(name="clickProxyURL")
    private String clickProxyURL;
    @Element(name="creativeId")
    private String creativeId;

    @Element(name="homeScreen")
    private String homeScreen;
    @Element(name="impressionTrackingURL")
    private String impressionTrackingURL;
    @Element(name="isRandomPick")
    private String isRandomPick;
    @Element(name="numberOfRatings")
    private String numberOfRatings;
    @Element(name="productId")
    private String productId;



    public Ad(){}
//    public Ad(String productName, String productThumbnail, String productDescription, float rating) {
//        this.productName = productName;
//        this.productThumbnail = productThumbnail;
//        this.productDescription = productDescription;
//        this.rating = rating;
//    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductThumbnail() {
        return productThumbnail;
    }

    public void setProductThumbnail(String productThumbnail) {
        this.productThumbnail = productThumbnail;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAverageRatingImageURL() {
        return averageRatingImageURL;
    }

    public void setAverageRatingImageURL(String averageRatingImageURL) {
        this.averageRatingImageURL = averageRatingImageURL;
    }

    public String getBidRate() {
        return bidRate;
    }

    public void setBidRate(String bidRate) {
        this.bidRate = bidRate;
    }

    public String getBillingTypeId() {
        return billingTypeId;
    }

    public void setBillingTypeId(String billingTypeId) {
        this.billingTypeId = billingTypeId;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    public String getCampaignDisplayOrder() {
        return campaignDisplayOrder;
    }

    public void setCampaignDisplayOrder(String campaignDisplayOrder) {
        this.campaignDisplayOrder = campaignDisplayOrder;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignTypeId() {
        return campaignTypeId;
    }

    public void setCampaignTypeId(String campaignTypeId) {
        this.campaignTypeId = campaignTypeId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getClickProxyURL() {
        return clickProxyURL;
    }

    public void setClickProxyURL(String clickProxyURL) {
        this.clickProxyURL = clickProxyURL;
    }

    public String getCreativeId() {
        return creativeId;
    }

    public void setCreativeId(String creativeId) {
        this.creativeId = creativeId;
    }

    public String getHomeScreen() {
        return homeScreen;
    }

    public void setHomeScreen(String homeScreen) {
        this.homeScreen = homeScreen;
    }

    public String getImpressionTrackingURL() {
        return impressionTrackingURL;
    }

    public void setImpressionTrackingURL(String impressionTrackingURL) {
        this.impressionTrackingURL = impressionTrackingURL;
    }

    public String getIsRandomPick() {
        return isRandomPick;
    }

    public void setIsRandomPick(String isRandomPick) {
        this.isRandomPick = isRandomPick;
    }

    public String getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(String numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
