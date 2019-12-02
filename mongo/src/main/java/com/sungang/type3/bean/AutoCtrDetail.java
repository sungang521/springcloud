package com.sungang.type3.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection="AutoCtrDetail")
public class AutoCtrDetail extends BaseBean{
    private Integer usrAutoModEnable;
    private Integer usrLuxAutoCtrEnable;
    private Integer usrPirAutoCtrEnable;
    private AutoCtrLightP1 autoCtrLightP1;

    @Override
    public String toString() {
        return "AutoCtrDetail{" +
                "usrAutoModEnable=" + usrAutoModEnable +
                ", usrLuxAutoCtrEnable=" + usrLuxAutoCtrEnable +
                ", usrPirAutoCtrEnable=" + usrPirAutoCtrEnable +
                ", autoCtrLightP1=" + autoCtrLightP1 +
                '}';
    }
}
