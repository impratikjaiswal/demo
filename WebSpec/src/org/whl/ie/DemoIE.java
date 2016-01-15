package org.whl.ie;

import org.watij.webspec.dsl.Tag;
import org.watij.webspec.dsl.WebSpec;

public class DemoIE {

    public static void main(String[] args) {
        String url = "http://fwjy.bjchy.gov.cn/yuyue.html";
        WebSpec spec = new WebSpec().ie();
        if (spec.ready()) {
            spec.open(url);
            spec.pauseUntilReady();
            Tag tag = spec.find.a("lianjie");
            boolean isOk = tag.exists();
            System.out.println("isOK = " + isOk);
            if (isOk) {
                tag.find("add").click();
            }
            // spec.find.img().find.
            // spec.find("images/ksyy.png").click();
            // spec.find.input().with.id("su").click();
            System.out.println(spec.source());
        } else {
            System.out.println("not ready");
        }
        spec.close();
    }

}
