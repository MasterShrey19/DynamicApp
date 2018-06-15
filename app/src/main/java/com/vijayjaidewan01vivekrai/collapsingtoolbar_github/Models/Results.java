package com.vijayjaidewan01vivekrai.collapsingtoolbar_github.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Results {
    @SerializedName("grid_orientation")
        String grid_orientation;
    @SerializedName("grid_columns")
        String grid_columns;
    @SerializedName("view_type")
        String view_type;
    @SerializedName("top_image_bg")
        String top_image_bg;
    @SerializedName("top_image_fg")
        String top_image_fg;
    @SerializedName("is_search")
        String is_search;
    @SerializedName("data")
        ArrayList<Data> data;
    @SerializedName("login_page")
        Login login;
    @SerializedName("toolbar")
        ToolBar toolBar;

    public void setView_type(String view_type) {
        this.view_type = view_type;
    }

    public void setTop_image_bg(String top_image_bg) {
        this.top_image_bg = top_image_bg;
    }

    public void setTop_image_fg(String top_image_fg) {
        this.top_image_fg = top_image_fg;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public void setIs_search(String is_search) {
        this.is_search = is_search;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setToolBar(ToolBar toolBar) {
        this.toolBar = toolBar;
    }

    public void setGrid_orientation(String grid_orientation) {
        this.grid_orientation = grid_orientation;
    }

    public void setGrid_columns(String grid_columns) {
        this.grid_columns = grid_columns;
    }


    public String getGrid_orientation() {
        return grid_orientation;
    }

    public String getGrid_columns() {
        return grid_columns;
    }

    public String getView_type() {
        return view_type;
    }

    public String getTop_image_bg() {
        return top_image_bg;
    }

    public String getTop_image_fg() {
        return top_image_fg;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public String getIs_search() {
        return is_search;
    }

    public Login getLogin() {
        return login;
    }

    public ToolBar getToolBar() {
        return toolBar;
    }
}