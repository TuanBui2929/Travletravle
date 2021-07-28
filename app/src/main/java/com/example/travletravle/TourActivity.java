package com.example.travletravle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.travletravle.adappter.AdappterSlider;
import com.example.travletravle.adappter.AdappterTour;
import com.example.travletravle.nameclass.ImageTour;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class TourActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<ImageTour> ImageArrayList ;
    AdappterTour adappterHinhanh;
    SliderView sliderView;
    Toolbar toolbar;
    int[] image={ R.drawable.c,
            R.drawable.d,
            R.drawable.t,
            R.drawable.h,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);
        toolbar = findViewById(R.id.toolbartour);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        anhxa();
    }
    void anhxa(){
        ImageArrayList = new ArrayList<>();
        gridView = (GridView) findViewById(R.id.gridtour);
        ImageArrayList.add(new ImageTour(R.drawable.sanmay,"Săn mấy đón bình minh Đà Lạt","400.000 VND"));
        ImageArrayList.add(new ImageTour(R.drawable.diadiemmoi,"Khám Phá Địa Điểm Mới Đà Lạt","400.000 VND"));
        ImageArrayList.add(new ImageTour(R.drawable.diadiemhot,"Check in địa điểm “HOT” Đà Lạt","400.000 VND"));
        ImageArrayList.add(new ImageTour(R.drawable.langbiang,"Chinh phục đỉnh Langbiang – thác Datanla – Hồ vô cực",
                "400.000 VND"));
        ImageArrayList.add(new ImageTour(R.drawable.thacba,"Khám phá ba thác Đà Lạt","400.000 VND"));
        ImageArrayList.add(new ImageTour(R.drawable.congchieng,"Văn hóa cồng chiêng Đà Lạt","170.000 VND"));
        ImageArrayList.add(new ImageTour(R.drawable.zoodoo,"Tham quan sở thú ZooDoo Đà Lạt","450.000 VND"));
        ImageArrayList.add(new ImageTour(R.drawable.camtrai,"Cắm trại qua đêm","290.000"));

        adappterHinhanh = new AdappterTour(R.layout.viewtour,ImageArrayList,TourActivity.this);
        gridView.setAdapter(adappterHinhanh);
        sliderView= findViewById(R.id.slidertour);
        AdappterSlider adappterSlider = new AdappterSlider(image);
        sliderView.setSliderAdapter(adappterSlider);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


        ArrayList<String> tourList1 = new ArrayList<>();
        tourList1.add("Đón bình minh săn mây đại ngàn");
        tourList1.add("Check in đồi chè Cầu Đất Farm");
        tourList1.add("Tham quan vườn hồng treo");
        tourList1.add("Vườn dâu Tây công nghệ cao");
        tourList1.add("Nắng Coffee – Lạc vào đồng Cừu giữa phố núi Đà Lạt");
        tourList1.add("Cà Phê Mê Linh");
        tourList1.add("Cà Phê Thúy Thuận");


        int image1=R.drawable.sanmay;
         String thoigian1="4h00 đến 11h00";
         String giatour1="400.000 VND "  ;
         String title1 ="Săn mấy đón bình minh Đà Lạt";
         String gioithieu1="Đây là chương trình tour có số lượng khách đặt nhiều nhất của Hoa Dalat Travel trong năm 2021.\n" + "Có thể nói đây là chương trình tour ấn tượng nhất. Được đông đảo những người yêu thiên nhiên lựa chọn. Bạn có thể xem video này để biết vì sao bạn không thể bỏ lỡ tour săn mây đà lạt. Bạn lưu ý chương trình này khởi hành rất sớm từ 4h sáng. Thời gian mà bạn săn mây đẹp nhất.";




        ArrayList<String> tourList2 = new ArrayList<>();
        tourList2.add("Check in đồi chè Cầu Đất Farm");
        tourList2.add("Tham quan và thưởng thức hồng treo địa phương");
        tourList2.add("Nắng – Lạc vào đồng Cừu giữa phố núi Đà Lạt, (Hồ Cá Koi, hoa Cúc Họa Mi, hoa Thạch Thảo…) (theo mùa)");
        tourList2.add("Tham quan vườn dâu Tây công nghệ cao");
        tourList2.add("Mama Dala – Tổ hợp check in siêu Hot (hơn 30 concepts với Đồng hồ TikTak, Dương Sĩ cổ đại, nhà bong bóng…)");
        tourList2.add("Lạc Tiên Giới – Thung lũng check in vô cùng ảo diệu (trải nghiệm xe jeep kì thú, hơn 30 tiểu cảnh tham hồ chọn lựa)");
        tourList2.add("Khu du lịch Thúy Thuận – Xưởng cà phê lớn ở Đà Lạt");

        int image2=R.drawable.diadiemmoi;
        String thoigian2="8h00 đến 16h00";
        String giatour2="400.000 VND";
        String title2 ="Khám phá địa điểm mới Đà Lạt";
        String gioithieu2="Tour này kết hợp hàng loạt những địa điểm sống ảo hot nhất, đẹp nhất. Chắc chắn bạn sẽ không muốn bỏ lỡ đâu.";



        ArrayList<String> tourList3 = new ArrayList<>();
        tourList3.add("Kombi land Coffee – Vương quốc xương rồng giữa lòng Đà Lạt");
        tourList3.add("Trang trại cún – Puppy Farm, điểm tham quan”hot” nhất hiện nay (hơn 36 loài chó quý hiếm, hơn 100 cá thể chó, tại đây bạn có thể mua các loại nông sản sạch được trồng tại Trang Trại).");
        tourList3.add("Tham quan vườn: bí ngô khổng lồ + dâu Tây công nghệ cao + dưa leo baby, dưa pepino + cà chua cherry, các vườn hoa…( theo mùa )");
        tourList3.add("Nhà Thờ Domaine Đà Lạt (địa điểm mua sắm đồ len Đà Lạt chất lượng và rẻ nhất)");
        tourList3.add("Khám phá “Green Hills” – Check in Cổng trời Bali, Cổng trời Nhật, Hồ trên mây, Tổ chim…");
        tourList3.add("QUE garden – Thiên đường sống ảo phong cách Nhật Bản ( Hồ cá KOI, Mặc trang trang phục người nhật,…)");


        int image3=R.drawable.diadiemhot;
        String thoigian3="8h00 đến 16h00";
        String giatour3="400.000 VND";
        String title3 ="Check in địa điểm “HOT” Đà Lạt";
        String gioithieu3="Tour này kết hợp hàng loạt những địa điểm sống ảo hot nhất, đẹp nhất. Chắc chắn bạn sẽ không muốn bỏ lỡ đâu.";


        ArrayList<String> tourList4 = new ArrayList<>();
        tourList4.add("Chinh phục núi LangBiang – nóc nhà Tây Nguyên (cao 1929m)");
        tourList4.add("Khám phá buôn làng người đồng bào K’ho và nhà thờ Xã Lát");
        tourList4.add("Đồi Robin – Cáp treo");
        tourList4.add("Thiền viện Trúc Lâm");
        tourList4.add("Thác Đatanla ( trải nghiệm máng trượt dài nhất Đông Nam Á với chiều dài 2400m)");
        tourList4.add("Đường hầm điêu khắc đất sét – Hồ Vô Cực – Hồ Cô Đơn");
        tourList4.add("Tham quan vườn dâu Tây công nghệ cao");
        tourList4.add("Hồ Tuyền Lâm");


        int image4=R.drawable.langbiang;
        String thoigian4="8h00 đến 16h00";
        String giatour4="400.000đ/1 khách";
        String title4 ="Chinh phục đỉnh Langbiang – thác Datanla – Hồ vô cực";
        String gioithieu4="Chương trình ghép đoàn duy nhất tham quan đỉnh Langbiang huyền thoại. Ngoài ra bạn còn được hái dâu tây cùng các điểm chi tiết như:";


        ArrayList<String> tourList5 = new ArrayList<>();
        tourList5.add("Thác Pongour");
        tourList5.add("Thác Prenn");
        tourList5.add("Cưỡi Voi, Cưỡi Đà Điểu (chi phí tự túc)");
        tourList5.add("Thác Voi");
        tourList5.add("Cà phê Mê Linh – Thưởng thức Cafe Chồn nguyên chất (chi phí tự túc )");
        tourList5.add("Cánh đồng hoa Tam Giác Mạch, hoa cánh bướm, hoa Hướng Dương…(theo mùa)");
        tourList5.add("Chùa Linh Ẩn – Tượng bồ tát Quan Âm cao nhất Việt Nam");
        tourList5.add("Trại nuôi dế – thưởng thức các món ăn từ dế");


        int image5=R.drawable.thacba;
        String thoigian5="8h00 đến 16h00";
        String giatour5="400.000 VND";
        String title5 ="Khám phá ba thác Đà Lạt";
        String gioithieu5="Để được ngắm nhìn Nam Thiên Đệ Nhất Thác bạn chỉ cần đăng ký tour này. Ngoài ra bạn cũng có thể ngắm nhìn cánh đồng hoa hướng dương cùng nhiều điểm hấp dẫn khác như:";


        ArrayList<String> tourList6 = new ArrayList<>();
        tourList6.add("Giao lưu Cồng Chiêng với người dân tộc bản địa");
        tourList6.add("Uống rượu Cần, thịt nướng đặc sản của người dân tộc bản địa");
        tourList6.add("Nhảy múa cùng các chàng trai cô gái");
        tourList6.add("Tham gia các trò chơi dân gian");


        int image6=R.drawable.congchieng;
        String thoigian6="18h15";
        String giatour6="170.000 VND";
        String title6 ="Văn hóa cồng chiêng Đà Lạt";
        String gioithieu6="Là chương trình tour duy nhất diễn ra vào buổi tối nhưng lại thu hút đủ lứa tuổi tham gia. Vì sự đặc biệt cũng như hấp dẫn của nó. Được tổ chức dưới chân núi Langbiang huyền thoại. Bạn có thể giao lưu với người đồng bào với những điệu múa ấn tượng cùng uống rượu cần và thịt nướng. Các điểm hấp dẫn trong tour:";


        ArrayList<String> tourList7 = new ArrayList<>();
        tourList7.add("Sở Thú Zoodoo Đà Lạt");
        tourList7.add("Trang trại rau và làng hoa Vạn Thành lớn nhất Đà Lạt");
        tourList7.add("Cánh đồng hoa Cẩm Tú Cầu – Nấc thang lên thiên đường – Cây cầu vàng");
        tourList7.add("Trang trại cún – Puppy Farm, điểm tham quan”hot” nhất hiện nay (hơn 36 loài chó quý hiếm, hơn 100 cá thể chó, tại đây bạn có thể mua các loại nông sản sạch được trồng tại Trang Trại).");
        tourList7.add("Tham quan vườn: bí ngô khổng lồ + dâu Tây công nghệ cao + dưa leo baby, dưa pepino + cà chua cherry, các vườn hoa… (theo mùa)");



        int image7=R.drawable.zoodoo;
        String thoigian7="8h00 đến 16h00";
        String giatour7="450.000 VND";
        String title7 ="Tham quan sở thú ZooDoo Đà Lạt";
        String gioithieu7="Sở hữu những con thú siêu đẹp và dễ thương mà chắc chắn bạn chưa từng được xem qua. Sở thú ZooDoo là nơi được rất nhiều các em và các bạn trẻ yêu thích.\n" +
                "\n" +
                "Còn gì tuyệt vời hơn khi có thể tự mình cho chúng ăn và vuốt ve chúng, thật thú vị phải không nào. Ngoài sở thú Zoodoo bạn còn được tham quan nhiều điểm hấp dẫn khác như:";


        ArrayList<String> tourList8 = new ArrayList<>();
        tourList8.add("Đốt lửa trại, ăn đồ nướng, thưởng thức rượu Đà Lạt");
        tourList8.add("Đàn hát, giao lưu văn nghệ  ngắm Đà Lạt về đêm");
        tourList8.add("Ngắm bình minh ăn sáng, thưởng thức cà phê Đà Lạt.");
        tourList8.add("Chụp hình bình minh và săn mây");


        int image8=R.drawable.camtrai;
        String thoigian8="14h chiều";
        String giatour8=" 600.000 VND";
        String title8 =" Cắm trại qua đêm";
        String gioithieu8="Là chương trình tour hot nhất về đêm. Bạn có thể thỏa sức ngắm nhìn ngàn sao trên những đồi thông thơ mộng bậc nhất đà lạt.\n";

        Bundle e1= new Bundle();
        e1.putStringArrayList("array",tourList1);
        e1.putString("title",title1);
        e1.putString("gioithieu",gioithieu1);
        e1.putString("thoigian",thoigian1);
        e1.putString("giatour",giatour1);
        e1.putInt("image",image1);

        Bundle e2= new Bundle();
        e2.putStringArrayList("array",tourList2);
        e2.putString("title",title2);
        e2.putString("gioithieu",gioithieu2);
        e2.putString("thoigian",thoigian2);
        e2.putString("giatour",giatour2);
        e2.putInt("image",image2);

        Bundle e3= new Bundle();
        e3.putStringArrayList("array",tourList3);
        e3.putString("title",title3);
        e3.putString("gioithieu",gioithieu3);
        e3.putString("thoigian",thoigian3);
        e3.putString("giatour",giatour3);
        e3.putInt("image",image3);
        Bundle e4= new Bundle();
        e4.putStringArrayList("array",tourList4);
        e4.putString("title",title4);
        e4.putString("gioithieu",gioithieu4);
        e4.putString("thoigian",thoigian4);
        e4.putString("giatour",giatour4);
        e4.putInt("image",image4);

        Bundle e5= new Bundle();
        e5.putStringArrayList("array",tourList5);
        e5.putString("title",title5);
        e5.putString("gioithieu",gioithieu5);
        e5.putString("thoigian",thoigian5);
        e5.putString("giatour",giatour5);
        e5.putInt("image",image5);

        Bundle e6= new Bundle();
        e6.putStringArrayList("array",tourList6);
        e6.putString("title",title6);
        e6.putString("gioithieu",gioithieu6);
        e6.putString("thoigian",thoigian6);
        e6.putString("giatour",giatour6);
        e6.putInt("image",image6);
        Bundle e7= new Bundle();
        e7.putStringArrayList("array",tourList7);
        e7.putString("title",title7);
        e7.putString("gioithieu",gioithieu7);
        e7.putString("thoigian",thoigian7);
        e7.putString("giatour",giatour7);
        e7.putInt("image",image7);
        Bundle e8= new Bundle();
        e8.putStringArrayList("array",tourList8);
        e8.putString("title",title8);
        e8.putString("gioithieu",gioithieu8);
        e8.putString("thoigian",thoigian8);
        e8.putString("giatour",giatour8);
        e8.putInt("image",image8);

        ArrayList<Bundle> bundleArrayList = new ArrayList<>();
        bundleArrayList.add(e1);
        bundleArrayList.add(e2);
        bundleArrayList.add(e3);
        bundleArrayList.add(e4);
        bundleArrayList.add(e5);
        bundleArrayList.add(e6);
        bundleArrayList.add(e7);
        bundleArrayList.add(e8);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(TourActivity.this,TourItemActivity.class);
                intent.putExtras(bundleArrayList.get(position));

                startActivity(intent);

            }
        });



    }

}