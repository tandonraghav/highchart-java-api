package nl.pvanassen.highchart.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import nl.pvanassen.highchart.api.base.BaseObject;

@XmlAccessorType(XmlAccessType.NONE)
public class Tooltip extends BaseObject {

    @XmlElement
    private Boolean crosshairs;

    @XmlElement
    private Boolean shared;

    public boolean isCrosshairs() {
        return crosshairs;
    }

    public boolean isShared() {
        return shared;
    }

    public Tooltip setCrosshairs(boolean b) {
        crosshairs = b;
        return this;
    }

    public Tooltip setShared(boolean shared) {
        this.shared = shared;
        return this;
    }

}
