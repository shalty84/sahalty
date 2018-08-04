package com.shalty.technicaltestdigitalturbine.types;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import java.util.List;



@Root(name = "ads", strict=false)
public class Ads {

        @ElementList(name = "ad",inline = true)
        //@Path("ads")
        private List<Ad> adlist;

    public List<Ad> getAdlist() {
        return adlist;
    }

    public void setAdlist(List<Ad> adlist) {
        this.adlist = adlist;
    }
}
