package com.standardbank.pokemonApi.model;

import java.util.List;


public class HeldItem {

private Item item;
private List<VersionDetail> versionDetails;


public Item getItem() {
return item;
}

public void setItem(Item item) {
this.item = item;
}

public List<VersionDetail> getVersionDetails() {
return versionDetails;
}

public void setVersionDetails(List<VersionDetail> versionDetails) {
this.versionDetails = versionDetails;
}



}