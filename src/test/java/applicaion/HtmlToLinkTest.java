package applicaion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;


class HtmlToLinkTest {
    private List<Link> model = new ArrayList<>();



    @BeforeEach
    void setUp() {
        model.add(new Link("Samsung Electronics Galaxy Note 20 5G Factory Unlocked Android Cell Phone, US Version, 128GB of Storage, Mobile Gaming Smartphone, Long-Lasting Battery, Mystic Gray",
                "/gp/slredirect/picassoRedirect.html/ref=pa_sp_atf_aps_sr_pg1_1?ie=UTF8&adId=A08711401TTV4CBNE1ZGE&url=%2FSamsung-Electronics-Unlocked-Smartphone-Long-Lasting%2Fdp%2FB08BX7LJ5T%2Fref%3Dsr_1_1_sspa%3Fdchild%3D1%26keywords%3Dsamsung%2Bnote%2B10%26qid%3D1609851667%26sr%3D8-1-spons%26psc%3D1&qualifier=1609851667&id=6256084695307854&widgetName=sp_atf",
                "4.6",
                "2,291"
        ));
        model.add(new Link("Samsung Electronics Galaxy Note 20 5G Factory Unlocked Android Cell Phone, US Version, 128GB of Storage, Mobile Gaming Smartphone, Long-Lasting Battery, Mystic Bronze, SM-N981UZNAXAA",
                "/Samsung-Electronics-Smartphone-Long-Lasting-SM-N981UZNAXAA/dp/B08BX8BZ1P/ref=sr_1_2?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-2",
                "4.6",
                "2,291"
        ));
        model.add(new Link("Samsung Galaxy Note 10 Factory Unlocked Cell Phone with 256GB (U.S. Warranty), Aura Black/ Note10",
                "/Samsung-Galaxy-Factory-Unlocked-Warranty/dp/B07V5KSWXM/ref=sr_1_3?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-3",
                "4.6",
                "3,941"
        ));
        model.add(new Link("Samsung Galaxy Note 10 Lite N770F 128GB Dual-SIM GSM Unlocked Phone (International Variant/US Compatible LTE) - Aura Glow",
                "/N770F-Dual-SIM-Unlocked-International-Compatible/dp/B084MD6Y5H/ref=sr_1_4?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-4",
                "4.4",
                "616"
        ));
        model.add(new Link("Samsung Galaxy Note 10+ Plus Factory Unlocked Cell Phone with 256GB (U.S. Warranty), Aura Black/ Note10+ w/Samsung Galaxy Watch Active2 (44mm), Aqua Black - US Version with Warranty",
                "/Samsung-Factory-Unlocked-Warranty-Active2/dp/B07YGQGD7Y/ref=sr_1_5?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-5",
                "4.7",
                "74"
        ));
        model.add(new Link("Samsung Galaxy S10+ Factory Unlocked Android Cell Phone | US Version | 128GB of Storage | Fingerprint ID and Facial Recognition | Long-Lasting Battery | Prism White",
                "/Samsung-Galaxy-Factory-Unlocked-Warranty/dp/B07N4KCW4X/ref=sr_1_6?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-6",
                "4.6",
                "784"
        ));
        model.add(new Link("Samsung Galaxy Note 10 4G Dual-SIM SM-N970F/DS Unlocked 4G/LTE Smartphone - International Version (Aura White)",
                "/Samsung-Dual-SIM-SM-N970F-Unlocked-Smartphone/dp/B08NCC7ZT8/ref=sr_1_7?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-7",
                "4.1",
                "83"
        ));
        model.add(new Link("Samsung Galaxy S20 FE 5G | Factory Unlocked Android Cell Phone | 128 GB | US Version Smartphone | Pro-Grade Camera, 30X Space Zoom, Night Mode | Cloud Navy",
                "/Samsung-Factory-Unlocked-Smartphone-Pro-Grade/dp/B08FYTSXGQ/ref=sr_1_8?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-8",
                "4.6",
                "1,673"
        ));
        model.add(new Link("Samsung Galaxy S20+ Plus 5G Factory Unlocked New Android Cell Phone US Version, 128GB of Storage, Fingerprint ID and Facial Recognition, Long-Lasting Battery, Cosmic Gray",
                "/Samsung-Unlocked-Fingerprint-Recognition-Long-Lasting/dp/B082XXZ5K3/ref=sr_1_9?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-9",
                "4.6",
                "356"
        ));
        model.add(new Link("USB C Cable 1ft 3Pack Hibiker 3A Type C Charging Cable Premium Nylon USB-C to USB-A Fast Charger C Cord For Samsung Galaxy S10 S10E S9 S8 S20 a10e a20 Plus,Note 10 9 8,Z Flip,LG G5 6 V20 30 40 (Black)",
                "/gp/slredirect/picassoRedirect.html/ref=pa_sp_mtf_aps_sr_pg1_1?ie=UTF8&adId=A045666531CRZJ55XUVWM&url=%2FHibiker-Charging-Premium-Charger-Samsung%2Fdp%2FB08DNP3MPY%2Fref%3Dsr_1_10_sspa%3Fdchild%3D1%26keywords%3Dsamsung%2Bnote%2B10%26qid%3D1609851667%26sr%3D8-10-spons%26psc%3D1&qualifier=1609851667&id=6256084695307854&widgetName=sp_mtf",
                "4.7",
                "1,344"
        ));
        model.add(new Link("Samsung Galaxy Note 10+ Plus Factory Unlocked Cell Phone with 256GB (U.S. Warranty), Aura Black/ Note10+ w/Galaxy Buds",
                "/Samsung-Galaxy-Factory-Unlocked-Warranty/dp/B07YBW77JT/ref=sr_1_11?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-11",
                "4.7",
                "118"
        ));
        model.add(new Link("Samsung Galaxy S10+, 128GB, Prism White - Fully Unlocked (Renewed)",
                "/Samsung-Factory-Unlocked-Warranty-Renewed/dp/B07PFL29FR/ref=sr_1_12?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-12",
                "4.4",
                "776"
        ));
        model.add(new Link("Samsung Galaxy Note 10+ Plus Factory Unlocked Cell Phone with 256GB (U.S. Warranty), Aura Glow (Silver) Note10+ w/Samsung Galaxy Watch Active2 (44mm), Aqua Black - US Version with Warranty",
                "/Samsung-Factory-Unlocked-Warranty-Active2/dp/B07YGPCFFN/ref=sr_1_13?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-13",
                "4.6",
                "32"
        ));
        model.add(new Link("Samsung Galaxy Note 10+ Plus 5G SM-N976 / 256GB / Factory Unlocked - Korea Manufactured International Version (Aura Black)",
                "/Samsung-Galaxy-SM-N976-Factory-Unlocked/dp/B085T1PMD7/ref=sr_1_14?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-14",
                "5.0",
                "3"
        ));
        model.add(new Link("USB Type C to 3.5mm Headphone Jack Adapter Glotao USB C to Aux Audio Dongle Cable Cord Compatible with Pixel 4 3 2 XL, Samsung Galaxy S20 Ultra Z Flip S20+ Note 20 10 S10 S9 Plus iPad Pro",
                "/gp/slredirect/picassoRedirect.html/ref=pa_sp_mtf_aps_sr_pg1_1?ie=UTF8&adId=A0784296YOL92HRVLA8T&url=%2FHeadphone-Adapter-Glotao-Compatible-Samsung%2Fdp%2FB08NHCFC4Z%2Fref%3Dsr_1_15_sspa%3Fdchild%3D1%26keywords%3Dsamsung%2Bnote%2B10%26qid%3D1609851667%26sr%3D8-15-spons%26psc%3D1%26smid%3DACMIOEF97JH5Q&qualifier=1609851667&id=6256084695307854&widgetName=sp_mtf",
                "non",
                "Non"
        ));
        model.add(new Link("Samsung Galaxy Note 9, 512GB, Ocean Blue - Fully Unlocked (Renewed)",
                "/Samsung-Unlocked-Warranty-Certified-Refurbished/dp/B07H8RFDYM/ref=sr_1_16?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-16",
                "4.5",
                "186"
        ));
        model.add(new Link("Samsung Galaxy A20S w/Triple Cameras (32GB, 3GB RAM) 6.5\" Display, Snapdragon 450, 4000mAh Battery, US & Global 4G LTE GSM Unlocked A207M/DS - International Model (Red, 32GB + 64GB SD Bundle)",
                "/Samsung-A20S-Cameras-Snapdragon-Unlocked/dp/B07ZG5RFK6/ref=sr_1_17?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-17",
                "4.3",
                "8,678"
        ));
        model.add(new Link("Samsung Galaxy A51 (128GB, 4GB) 6.5\", 48MP Quad Camera, Dual SIM GSM Unlocked A515F/DS- Global 4G LTE International Model (Prism Crush White)",
                "/Samsung-Galaxy-Camera-Unlocked-International/dp/B083NJRP1L/ref=sr_1_18?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-18",
                "4.5",
                "1,197"
        ));
        model.add(new Link("Samsung Galaxy Note 9, 512GB, Lavender Purple -Fully Unlocked (Renewed)",
                "/Samsung-Unlocked-Warranty-Certified-Refurbished/dp/B07H8PQCNW/ref=sr_1_19?dchild=1&keywords=samsung+note+10&qid=1609851667&sr=8-19",
                "4.5",
                "70"
        ));
        model.add(new Link("TWAYRDIO USB C Headphone with Mic Remote Control, Radiation-Proof Type C Earphone for Samsung Note 10 S20, One Plus 6T 7 8, Google Pixel 3/2/XL",
                "/gp/slredirect/picassoRedirect.html/ref=pa_sp_btf_aps_sr_pg1_1?ie=UTF8&adId=A02341006B85TPE07YRK&url=%2FTWAYRDIO-Headphone-Control-Radiation-Proof-Earphone%2Fdp%2FB08C31CMQP%2Fref%3Dsr_1_20_sspa%3Fdchild%3D1%26keywords%3Dsamsung%2Bnote%2B10%26qid%3D1609851667%26sr%3D8-20-spons%26psc%3D1&qualifier=1609851667&id=6256084695307854&widgetName=sp_btf",
                "non",
                "Non"
        ));
    }

    @ParameterizedTest
    @CsvSource({"data/link.html"})
    void LinksIsExist( String path) throws IOException {

        List<Link> result = new HtmlToLink().getLinks(path);
       assertTrue(!result.isEmpty());
    }

    @Test
    void LinksSize() throws IOException {

       String path="data/link.html";

        List<Link> result = new HtmlToLink().getLinks(path);
        assertTrue(result.size()==model.size());

    }

    @Test
    @Disabled
    void LinksSize3() throws IOException {

        String path="data/samsung s20 case _ eBay.html";

        List<Link> result = new HtmlToLink().getLinks(path);
        assertTrue(result.size()==model.size());

    }

    @Test
    void LinksToString() throws IOException {

        String path="data/link.html";

        List<Link> result = new HtmlToLink().getLinks(path);
        assertEquals(result.toString(),model.toString());

    }
    @Test
    void testGetLinksNull() throws IOException {

        String path="";

        List<Link> result = new HtmlToLink().getLinks(path);
        assertNull(result);

    }
    @Test
    void testGetLinksIterableEquals() throws IOException {

        String path="data/link.html";

        List<Link> result = new HtmlToLink().getLinks(path);
        assertIterableEquals(result,model);

    }
    }
