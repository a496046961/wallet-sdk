package com.wallet.walletsdk;


import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.github.lalyos.jfiglet.FigletFont;
import org.junit.Test;

import java.io.IOException;

public class BannerTest {

    private static final Log log = LogFactory.get();

    @Test
    public void test1() {
        try {
            String s = FigletFont.convertOneLine("Central wallet");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
