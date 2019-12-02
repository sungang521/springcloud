package com.sungang.type3.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AutoCtrLightP1 extends BaseBean {
    private Integer usrLuxAutoCtrOnEnable;
    private Integer usrLuxAutoCtrOffEnable;
    private Integer usrLuxAutoCtrParamEnable;
    private AutoCtrLightP2 autoCtrLightP2;
}
