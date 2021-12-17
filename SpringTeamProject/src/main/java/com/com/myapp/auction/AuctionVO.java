package com.com.myapp.auction;

public class AuctionVO {
	private int seq;
	private String username;
	private String category;
	private String material;
	private int price;
	private String bidder;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBidder() {
		return bidder;
	}
	public void setBidder(String bidder) {
		this.bidder = bidder;
	}
}
