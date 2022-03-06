package org.sy.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: SunYang
 * @date: 2022/2/11
 * @Copyright： sunyangqaq@foxmail.com
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if(pv.getName().endsWith(propertyName)) {
                return pv;
            }
        }
        return null;
    }

}
