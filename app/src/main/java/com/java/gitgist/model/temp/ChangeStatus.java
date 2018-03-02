package com.java.gitgist.model.temp;

import com.google.gson.annotations.SerializedName;

public class ChangeStatus{

	@SerializedName("total")
	private int total;

	@SerializedName("additions")
	private int additions;

	@SerializedName("deletions")
	private int deletions;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setAdditions(int additions){
		this.additions = additions;
	}

	public int getAdditions(){
		return additions;
	}

	public void setDeletions(int deletions){
		this.deletions = deletions;
	}

	public int getDeletions(){
		return deletions;
	}
}