package nl.pvanassen.highchart.api;

import javax.xml.bind.annotation.*;

import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.label.LabelsItems;
import nl.pvanassen.highchart.api.utils.JsonArray;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(namespace = "chart-options")
public class Labels extends BaseObject {

    @XmlTransient
    private JsonArray<LabelsItems> items;

    public Labels() {
    }

    @XmlTransient
    public JsonArray<LabelsItems> getItems() {
        if (items == null) {
            items = new JsonArray<LabelsItems>();
        }

        return items;
    }

}
