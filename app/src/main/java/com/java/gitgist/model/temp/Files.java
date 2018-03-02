package com.java.gitgist.model.temp;

import com.google.gson.annotations.SerializedName;
import com.java.gitgist.model.*;

public class Files{

	@SerializedName("BulkRename.applescript")
	private BulkRenameApplescript bulkRenameApplescript;

	@SerializedName( value="gistfile1.txt", alternate={"config.json", "CoroRP_fiche_RoT.md",
			"sort_timings.zsh", "get_db3_tbl.py", "index.css", "svg", "MountainousUnsungSecurity.c"})
	private Gistfile1Txt gistfile1Txt;

	public void setGistfile1Txt(Gistfile1Txt gistfile1Txt){
		this.gistfile1Txt = gistfile1Txt;
	}

	public Gistfile1Txt getGistfile1Txt(){
		return gistfile1Txt;
	}

	public void setBulkRenameApplescript(BulkRenameApplescript bulkRenameApplescript){
		this.bulkRenameApplescript = bulkRenameApplescript;
	}

	public BulkRenameApplescript getBulkRenameApplescript(){
		return bulkRenameApplescript;
	}
}