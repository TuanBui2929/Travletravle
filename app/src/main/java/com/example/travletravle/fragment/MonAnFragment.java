package com.example.travletravle.fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.travletravle.Noidung_Amthuc;
import com.example.travletravle.R;
import com.example.travletravle.adappter.AdappterAmthucnhahang;
import com.example.travletravle.nameclass.NhahangvaAmthuc;

import java.util.ArrayList;
public class MonAnFragment extends Fragment {
    GridView gridView;
    ArrayList<NhahangvaAmthuc>  amthucsArrayList  = new ArrayList<>(); ;
    AdappterAmthucnhahang adappterHinhanh;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view ==null) {
            view = inflater.inflate(R.layout.fragment_mon_an, container, false);
            gridView = (GridView) view.findViewById(R.id.gridamthuc);

            adappterHinhanh = new AdappterAmthucnhahang(R.layout.viewnhahangamthuc, getarraylist(), this.getActivity());
            gridView.setAdapter(adappterHinhanh);
            return view;
        }
        return view;
    }
    private ArrayList<NhahangvaAmthuc> getarraylist() {

        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.ga1,"Bánh Ướt Lòng Gà Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.banhcan1,"Bánh Căn Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.nemnuong1,"Nem Nướng Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.trang1,"Bánh Tráng Nướng Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.xiumai1,"Bánh Mì Xíu Mại Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.kembo1,"Kem Bơ Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.daunanh1,"Đậu Nành Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.laubo1,"Lẩu Bò Tơ Atiso Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.chevung1,"Chè Vừng Nóng Đà Lạt"));
        amthucsArrayList.add(new NhahangvaAmthuc(R.drawable.apchao1,"Bánh Mì Chảo Đà Lạt"));

        ArrayList<String> athuc1 = new ArrayList<>();
        String amthuc1 ="Bánh Ướt Lòng Gà Đà Lạt";
        String ngaydang1 ="29/05/2021";
        String amthucdiachi1 ="•\tQuán Trang: 15F Tăng Bạt Hổ\n" +
                "•\tQuán Long: Hẻm 202, lô A16, KQH Phan Đình Phùng\n" +
                "•\tQuán Hằng 68: 68 Phan Đình Phùng\n";
        String nguoidangamthuc1 ="Biên soạn: Trung Nam";
        String amthuc11 ="Bạn cho rằng bánh ướt và lòng gà chẳng liên quan gì với nhau? Nhầm to rồi nhé! Với sự sáng tạo của người dân Đà Lạt, sự kết hợp của hai món ănnày lại trở nên hợp lý hơn bao giờ hết.";
        String amthuc21 ="Vị dẻo mềm của bánh ướt cùng thịt gà thơm ngon, kèm thêm nước mắm pha, rau thơm, giá hành khiến người ăn phải gật gù, tấm tắc khen ngon. Đây là món ăn Đà Lạt đặc sắc mà bạn nhất định phải thử ít nhất một lần trong đời. ";
        int igamthuc11 = R.drawable.ga1;
        int igamthuc21 = R.drawable.ga2;
        int igamthuc31 = R.drawable.ga3;

        ArrayList<String> athuc2 = new ArrayList<>();
        String amthuc2 ="Bánh Căn Đà Lạt";
        String ngaydang2 =" 29/05/2021";
        String amthucdiachi2 ="•\tBánh Căn Lệ: 27/44 Yersin, phường 10\n" +
                "•\tBánh Căn Nhà Chung: 13 Nhà Chung\n" +
                "•\tBánh Căn Dốc Nhà Làng: 15A Nguyễn Biểu, phường 1\n";
        String nguoidangamthuc2 ="Biên soạn: Danh Tuấn";
        String amthuc12 ="Đến với thành phố sương mù, những món ăn Đà Lạt nóng hổi, bày bán trong không gian nhỏ như bánh căn luôn được ưa chuộng. ";
        String amthuc22 ="Chỉ cần cắn một miếng là cảm nhận được vỏ bánh giòn, nhân trứng thơm nồng ăn cùng nước mắm hành, xíu mại tan dần trong miệng. Cảm giác phải nói là... mê ly trong thời tiết lành lạnh luôn. Món ăn Đà Lạt này rất phù hợp để ăn sáng hoặc ăn bữa xế. ";
        int igamthuc12 = R.drawable.banhcan1;
        int igamthuc22 = R.drawable.banhcan2;
        int igamthuc32 = R.drawable.banhcan3;

        ArrayList<String> athuc3 = new ArrayList<>();
        String amthuc3 ="Nem Nướng Đà Lạt";
        String ngaydang3 =" 29/05/2021";
        String amthucdiachi3 ="•\tQuán Bà Hùng: 328 Phan Đình Phùng\n" +
                "•\tQuán Bà Nghĩa: 45 Bùi Thị Xuân, phường 2\n" +
                "•\tQuán Hùng Vân: 150 Bùi Thị Xuân, phường 2\n";
        String nguoidangamthuc3 ="Biên soạn: Đăng Khoa";
        String amthuc13 ="Nem nướng là cái tên nổi bật trong danh sách những món ăn Đà Lạt phải thử khi đi du lịch. Điều đặc biệt làm nên thương hiệu của món này chính là nước chấm được pha chế theo cách riêng. ";
        String amthuc23 ="Nem được làm từ nguyên liệu chính là thịt heo ở phần nạc vai, ít mỡ và nướng trên bếp than hồng. Nghe thì đơn giản nhưng đối với người sành ăn, món đặc sản Đà Lạt này nhất định phải có “bí kíp” riêng thì mới tạo được hương vị đặc sắc đến vậy.";
        int igamthuc13 = R.drawable.nemnuong1;
        int igamthuc23 = R.drawable.nemnuong2;
        int igamthuc33 = R.drawable.nemnuong3;

        ArrayList<String> athuc4 = new ArrayList<>();
        String amthuc4 ="Bánh Tráng Nướng Đà Lạt";
        String ngaydang4 =" 29/05/2021";
        String amthucdiachi4 ="•\tBánh tráng nướng Dì Đinh: 26 Hoàng Diệu, phường 5\n" +
                "•\tBánh tráng nướng 61: 61 Nguyễn Văn Trỗi\n" +
                "•\tBánh tráng nướng Bùi Thị Xuân: 180 Bùi Thị Xuân\n";
        String nguoidangamthuc4 ="Biên soạn: Trung Nam";
        String amthuc14 ="Bánh tráng nướng là món ăn vặt phổ biến mà bất kỳ ai đặt chân đến thành phố hoa cũng từng thử qua. Bánh tráng được nướng trên than đến khi giòn rụm, \"tô điểm\" thêm với đủ loại nguyên liệu như trứng đánh, hành lá, tóp mỡ, tôm khô.... Nhiều du khách nước ngoài còn đùa nhau rằng món ăn Đà Lạt này giống như “bánh pizza kiểu Việt Nam”. ";
        String amthuc24 ="Trong tiết trời se lạnh, bước chân vào bất kỳ quán bánh tráng nướng nào cũng khiến bạn \"ấm lòng\" theo cả nghĩa đen lẫn nghĩa bóng. ";
        int igamthuc14 = R.drawable.trang1;
        int igamthuc24 = R.drawable.trang2;
        int igamthuc34 = R.drawable.trang3;

        ArrayList<String> athuc5 = new ArrayList<>();
        String amthuc5 ="Bánh Mì Xíu Mại Đà Lạt";
        String ngaydang5 =" 29/05/2021";
        String amthucdiachi5 ="•\tHẻm số 1, đường Thông Thiên Học\n" +
                "•\t26 Trần Nhật Duật – Hoàng Diệu\n" +
                "•\tQuán Cô Sương: 14 Ánh Sáng, phường 1\n";
        String nguoidangamthuc5 ="Biên soạn: Danh Tuấn";
        String amthuc15 ="Bánh mì xíu mại còn có tên gọi là bánh mì chấm hay bánh mì chảo. Cùng là bánh mì xíu mại, nhưng tại Đà Lạt, thực khách cảm nhận rất rõ rằng xíu mại ngon đặc biệt hơn so với những địa phương khác.";
        String amthuc25 ="Xíu mại được làm từ thịt nạc xay nhuyễn, có độ dai vừa đủ, nước dùng được chế biến từ xương heo ninh nhừ nên có vị ngọt thanh, không béo ngậy. Điểm thêm chút hành lá cắt nhuyễn càng làm món ăn hấp dẫn hơn. Đừng tự nhận là \"thực thần\" nếu bạn chưa ăn qua món đặc sản Đà Lạt này nhé! ";
        int igamthuc15 = R.drawable.xiumai1;
        int igamthuc25 = R.drawable.xiumai2;
        int igamthuc35 = R.drawable.xiumai3;

        ArrayList<String> athuc6 = new ArrayList<>();
        String amthuc6 ="Kem Bơ Đà Lạt";
        String ngaydang6=" 29/05/2021";
        String amthucdiachi6 ="•\tKem bơ Thanh Thảo: 76 Nguyễn Văn Trỗi\n" +
                "•\tKem bơ và chè Nari Đà Lạt: 74C Nguyễn Văn Trỗi\n" +
                "•\tKem bơ Phụng Đà Lạt: 97A Nguyễn Văn Trỗi\n";
        String nguoidangamthuc6 ="Biên soạn: Đăng Khoa";
        String amthuc16 ="Trời càng lạnh, ăn kem càng thích. Tín đồ nghiện đồ ngọt không thể bỏ qua kem bơ Đà Lạt ngon “quên lối về”. ";
        String amthuc26 ="Kem bơ đặc biệt vì được chế biến từ loại bơ sáp béo bùi, thơm nồng hòa cùng sữa đặc ngọt lịm. Thưởng thức món kem bơ lạnh tê lưỡi là trải nghiệm vô cùng thú vị, #teamKlook nhớ thử nhé!";
        int igamthuc16 = R.drawable.kembo1;
        int igamthuc26 = R.drawable.kembo2;
        int igamthuc36 = R.drawable.kembo3;

        ArrayList<String> athuc7 = new ArrayList<>();
        String amthuc7 ="Đậu Nành Đà Lạt";
        String ngaydang7 =" 29/05/2021";
        String amthucdiachi7 ="•\tQuán Hoa Sữa: 64 Tăng Bạt Hổ, phường 1, Đà Lạt\n" +
                "•\tSữa đậu nành Dung Béo: 2/2 Nguyễn Văn Cừ\n" +
                "•\tSữa Cô Lan: hẻm 184 Phan Đình Phùng, Đà Lạt\n";
        String nguoidangamthuc7 ="Biên soạn: Trung Nam";
        String amthuc17 ="Đà Lạt thật là vùng đất làm người ta dễ... béo! Ngay cả món thức uống mộc mạc như sữa đậu nành, khi nhâm nhi tại đây cũng trở nên thơm ngon đến lạ. ";
        String amthuc27 ="Bạn có thể dễ dàng tìm thấy các gánh sữa đậu nành nóng trên các con phố hoặc chợ đêm. Bất cứ lúc nào cần chút hơi ấm cho cơ thể, bạn hãy mua ngay một ly sữa đậu nành nóng hổi và ăn kèm với bánh ngọt. Cảm giác rất là \"chill\" luôn đấy. ";
        int igamthuc17 = R.drawable.daunanh1;
        int igamthuc27 = R.drawable.daunanh2;
        int igamthuc37 = R.drawable.daunanh3;

        ArrayList<String> athuc8 = new ArrayList<>();
        String amthuc8 ="Lẩu Bò Tơ Atiso Đà Lạt";
        String ngaydang8 =" 29/05/2021";
        String amthucdiachi8 ="Quán Xưa: 427/3 Phan Đình Phùng";
        String nguoidangamthuc8 ="Biên soạn: Danh Tuấn";
        String amthuc18 ="Lẩu bò không phải món ăn xa lạ đối với thực khách gần xa. Thế nhưng phiên bản lẩu bò được biến tấu khi nấu cùng lá atiso lại khiến món ăn dân dã này trở nên đặc biệt hơn hẳn.";
        String amthuc28 ="Vẫn với nguyên liệu chính là thịt bò, nhưng nước lẩu được nấu thêm cùng với lá atiso trở nên thanh hơn, ngọt hơn rất nhiều. Hãy tự mình trải nghiệm nghe. ";
        int igamthuc18 = R.drawable.laubo1;
        int igamthuc28 = R.drawable.laubo2;
        int igamthuc38 = R.drawable.laubo3;

        ArrayList<String> athuc9 = new ArrayList<>();
        String amthuc9 ="Chè Vừng Nóng Đà Lạt";
        String ngaydang9 =" 29/05/2021";
        String amthucdiachi9 ="Ngọc Hiệp: 64i Phan Đình Phùng";
        String nguoidangamthuc9 ="Biên soạn: Đăng Khoa";
        String amthuc19 ="Thêm một món ăn Đà Lạt hay ho khác là chè vừng đen (hay chè mè đen trong miền Nam). Chè vừng đen thơm thơm vị vừng, ngọt nhẹ, thoảng mùi dứa vô cùng quyến rũ. Địa điểm hiếm hoi bán món đặc sản Đà Lạt này là con hẻm nhỏ ở đường Phan Đình Phùng";
        String amthuc29 ="Bạn có thể hỏi thăm người dân địa phương để được dẫn đường đến quán. Quán rất đông người nên chỉ mở cửa từ 3 giờ chiều đến khoảng 5 giờ là hết. Nếu có ý định ghé ăn thử, bạn nên đi sớm nhé.";
        int igamthuc19 = R.drawable.chevung1;
        int igamthuc29 = R.drawable.chevung2;
        int igamthuc39 = R.drawable.chevung3;

        ArrayList<String> athuc10 = new ArrayList<>();
        String amthuc10 ="Bánh Mì Chảo Đà Lạt";
        String ngaydang10 =" 29/05/2021";
        String amthucdiachi10 ="Bami Cô Bống: 11, khu Hoà Bình, Đà Lạt, Lâm Đồng\n" +
                "•\tBánh mì chảo Đà Lạt 27: số 16B, đường Nguyễn Lương Bằng, phường 2, Đà Lạt, Lâm Đồng | Quán chỉ mở vào buổi sáng. \n" +
                "•\tHẻm: số 81, đường Phan Đình Phùng, phường 1, Đà Lạt, Lâm Đồng\n";
        String nguoidangamthuc10 ="Biên soạn: Trung Nam";
        String amthuc110 ="Bánh mì chảo là món ăn sáng nổi tiếng ở Đà Lạt, không chỉ đối với người dân địa phương mà còn được đông đảo du khách yêu mến.";
        String amthuc210 ="Với chi phí từ 30.000đ đến 60.000đ, bạn đã có ngay một phần bánh mì chảo “đầy ú ụ” trứng ốp-la, xíu mại, xúc xích, pa-tê gan,…; cho thêm chút muối tiêu chanh hoặc nước tương rồi chấm bánh mì thì phải nói là ăn-hoài-không-chán. Tuỳ theo độ đầy đặn của khẩu phần ăn mà giá bánh mì chảo Đà Lạt có thể dao động đến hơn 100.000đ/phần. #teamKlook lưu ý điểm này khi gọi món nhé.";
        int igamthuc110 = R.drawable.apchao1;
        int igamthuc210 = R.drawable.apchao2;
        int igamthuc310 = R.drawable.apchao3;

        Bundle a1= new Bundle();
        a1.putStringArrayList("arrayamthuc",athuc1);
        a1.putString("amthuc",amthuc1);
        a1.putString("amthucdiachi", amthucdiachi1);
        a1.putString("ngaydang", ngaydang1);
        a1.putString("nguoidangamthuc",nguoidangamthuc1);
        a1.putString("amthuc1",amthuc11);
        a1.putString("amthuc2",amthuc21);
        a1.putInt("igamthuc1", igamthuc11);
        a1.putInt("igamthuc2", igamthuc21);
        a1.putInt("igamthuc3", igamthuc31);

        Bundle a2= new Bundle();
        a2.putStringArrayList("arrayamthuc",athuc2);
        a2.putString("amthuc",amthuc2);
        a2.putString("amthucdiachi", amthucdiachi2);
        a2.putString("ngaydang", ngaydang2);
        a2.putString("nguoidangamthuc",nguoidangamthuc2);
        a2.putString("amthuc1",amthuc12);
        a2.putString("amthuc2",amthuc22);
        a2.putInt("igamthuc1", igamthuc12);
        a2.putInt("igamthuc2", igamthuc22);
        a2.putInt("igamthuc3", igamthuc32);

        Bundle a3= new Bundle();
        a3.putStringArrayList("arrayamthuc",athuc3);
        a3.putString("amthuc",amthuc3);
        a3.putString("amthucdiachi", amthucdiachi3);
        a3.putString("ngaydang", ngaydang3);
        a3.putString("nguoidangamthuc",nguoidangamthuc3);
        a3.putString("amthuc1",amthuc13);
        a3.putString("amthuc2",amthuc23);
        a3.putInt("igamthuc1", igamthuc13);
        a3.putInt("igamthuc2", igamthuc23);
        a3.putInt("igamthuc3", igamthuc33);

        Bundle a4= new Bundle();
        a4.putStringArrayList("arrayamthuc",athuc4);
        a4.putString("amthuc",amthuc4);
        a4.putString("amthucdiachi", amthucdiachi4);
        a4.putString("ngaydang", ngaydang4);
        a4.putString("nguoidangamthuc",nguoidangamthuc4);
        a4.putString("amthuc1",amthuc14);
        a4.putString("amthuc2",amthuc24);
        a4.putInt("igamthuc1", igamthuc14);
        a4.putInt("igamthuc2", igamthuc24);
        a4.putInt("igamthuc3", igamthuc34);

        Bundle a5= new Bundle();
        a5.putStringArrayList("arrayamthuc",athuc5);
        a5.putString("amthuc",amthuc5);
        a5.putString("amthucdiachi", amthucdiachi5);
        a5.putString("ngaydang", ngaydang5);
        a5.putString("nguoidangamthuc",nguoidangamthuc5);
        a5.putString("amthuc1",amthuc15);
        a5.putString("amthuc2",amthuc25);
        a5.putInt("igamthuc1", igamthuc15);
        a5.putInt("igamthuc2", igamthuc25);
        a5.putInt("igamthuc3", igamthuc35);

        Bundle a6= new Bundle();
        a6.putStringArrayList("arrayamthuc",athuc6);
        a6.putString("amthuc",amthuc6);
        a6.putString("amthucdiachi", amthucdiachi6);
        a6.putString("ngaydang", ngaydang6);
        a6.putString("nguoidangamthuc",nguoidangamthuc6);
        a6.putString("amthuc1",amthuc16);
        a6.putString("amthuc2",amthuc26);
        a6.putInt("igamthuc1", igamthuc16);
        a6.putInt("igamthuc2", igamthuc26);
        a6.putInt("igamthuc3", igamthuc36);

        Bundle a7= new Bundle();
        a7.putStringArrayList("arrayamthuc",athuc7);
        a7.putString("amthuc",amthuc7);
        a7.putString("amthucdiachi", amthucdiachi7);
        a7.putString("ngaydang", ngaydang7);
        a7.putString("nguoidangamthuc",nguoidangamthuc7);
        a7.putString("amthuc1",amthuc17);
        a7.putString("amthuc2",amthuc27);
        a7.putInt("igamthuc1", igamthuc17);
        a7.putInt("igamthuc2", igamthuc27);
        a7.putInt("igamthuc3", igamthuc37);

        Bundle a8= new Bundle();
        a8.putStringArrayList("arrayamthuc",athuc8);
        a8.putString("amthuc",amthuc8);
        a8.putString("amthucdiachi", amthucdiachi8);
        a8.putString("ngaydang", ngaydang8);
        a8.putString("nguoidangamthuc",nguoidangamthuc8);
        a8.putString("amthuc1",amthuc18);
        a8.putString("amthuc2",amthuc28);
        a8.putInt("igamthuc1", igamthuc18);
        a8.putInt("igamthuc2", igamthuc28);
        a8.putInt("igamthuc3", igamthuc38);

        Bundle a9= new Bundle();
        a9.putStringArrayList("arrayamthuc",athuc9);
        a9.putString("amthuc",amthuc9);
        a9.putString("amthucdiachi", amthucdiachi9);
        a9.putString("ngaydang", ngaydang9);
        a9.putString("nguoidangamthuc",nguoidangamthuc9);
        a9.putString("amthuc1",amthuc19);
        a9.putString("amthuc2",amthuc29);
        a9.putInt("igamthuc1", igamthuc19);
        a9.putInt("igamthuc2", igamthuc29);
        a9.putInt("igamthuc3", igamthuc39);

        Bundle a10= new Bundle();
        a10.putStringArrayList("arrayamthuc",athuc10);
        a10.putString("amthuc",amthuc10);
        a10.putString("amthucdiachi", amthucdiachi10);
        a10.putString("ngaydang", ngaydang10);
        a10.putString("nguoidangamthuc",nguoidangamthuc10);
        a10.putString("amthuc1",amthuc110);
        a10.putString("amthuc2",amthuc210);
        a10.putInt("igamthuc1", igamthuc110);
        a10.putInt("igamthuc2", igamthuc210);
        a10.putInt("igamthuc3", igamthuc310);

        ArrayList<Bundle> bundleArrayList = new ArrayList<>();
        bundleArrayList.add(a1);
        bundleArrayList.add(a2);
        bundleArrayList.add(a3);
        bundleArrayList.add(a4);
        bundleArrayList.add(a5);
        bundleArrayList.add(a6);
        bundleArrayList.add(a7);
        bundleArrayList.add(a8);
        bundleArrayList.add(a9);
        bundleArrayList.add(a10);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MonAnFragment.this.getActivity(), Noidung_Amthuc.class);
                intent.putExtras(bundleArrayList.get(position));
                startActivity(intent);
            }

        });


        return amthucsArrayList;
    }
}