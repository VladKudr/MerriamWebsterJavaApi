package org.merriam_api.model;


import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by kudrjavtsev on 23/09/2016.
 * MerriamWebsterJavaApi
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "entry_list")
public class EntryList {


    @XmlElement(name = "entry")
    List<Entry> entry;


    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }


}



