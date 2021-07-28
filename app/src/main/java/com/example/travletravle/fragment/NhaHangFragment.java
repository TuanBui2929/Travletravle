package com.example.travletravle.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.travletravle.Noidung_Nhahang;
import com.example.travletravle.R;
import com.example.travletravle.adappter.AdappterAmthucnhahang;
import com.example.travletravle.nameclass.NhahangvaAmthuc;

import java.util.ArrayList;


public class NhaHangFragment extends Fragment {
    GridView gridView1;
    ArrayList<NhahangvaAmthuc> nhahangArrayList  = new ArrayList<>(); ;
    AdappterAmthucnhahang adappterHinhanh;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nha_hang, container, false);
        gridView1 = (GridView) view.findViewById(R.id.gridnhahang);
        nhahangArrayList.add(new NhahangvaAmthuc(R.drawable.nh11,"Nhà hàng Memory Đà Lạt"));
        nhahangArrayList.add(new NhahangvaAmthuc(R.drawable.nh31,"The May Restaurant"));
        nhahangArrayList.add(new NhahangvaAmthuc(R.drawable.nh21,"Nhà hàng Nhà Tôi"));
        nhahangArrayList.add(new NhahangvaAmthuc(R.drawable.nh41,"Nhà hàng cơm niêu Hương Việt"));
        nhahangArrayList.add(new NhahangvaAmthuc(R.drawable.nh51,"Nhà hàng Song Mây"));
        nhahangArrayList.add(new NhahangvaAmthuc(R.drawable.nh61,"Nhà hàng Đà Lạt Xưa"));
        nhahangArrayList.add(new NhahangvaAmthuc(R.drawable.nh71,"Nhà hàng Léguda buffet rau Đà Lạt"));

        adappterHinhanh = new AdappterAmthucnhahang(R.layout.viewnhahangamthuc,nhahangArrayList,getActivity());
        gridView1.setAdapter(adappterHinhanh);


        ArrayList<String> nhang1 = new ArrayList<>();
        String nhahang1 ="Nhà hàng Memory Đà Lạt";
        String ngaydangnhahang1 ="24B Hùng Vương";
        String nguoidangnhahang1 ="0898.911.199";
        String nhahang11 ="Đi Đà Lạt ở đâu? ăn gì? Hãy note ngay cái tên “nhà hàng Memory Đà Lạt”. Để dành cho chuyến đi sắp tới của bạn nào. Memory là một địa điểm kết hợp bao gồm khu biệt thự, phòng trà, nhà hàng.\n" +
                "\n" +
                "Nhà hàng Memory Đà Lạt sở hữu menu toàn món ăn ngon. Mỗi món ăn đều mang một sắc màu và hương vị riêng biệt. Các nguyên liệu nấu ăn được nhập về sau đó sơ chế sạch sẽ rồi mới đem đi chế biến. Menu đa dạng, best seller của nhà hàng chính là: bún thố, sườn cừu, beefsteak, …. Cứ phải nói là món nào món nấy “rất ngon, nó ngon mà nó ngon còn ngon hơn cả chữ ngon”.\n";
        String nhahang21 ="Sáng mở mắt ra, làm ngay một tô bún thố nóng hổi thì hẳn là một ngày ngập tràn năng lượng. Trời lạnh mà cùng thưởng thức beefsteak, nhâm nhi một ly rượu vang thì lãng mạn biết bao. Không những thế, còn rất rất nhiều món ngon cho thực khách lựa chọn.\n" +
                "\n" +
                "Nói về chất lượng món ngon ở đây thì cứ phải để 5 sao thì mới đáng được. Dưới tay nghề của bếp trưởng có hơn 20 năm kinh nghiệm. Món ăn của Memory càng trở nên ngon miệng và đẹp mắt. Hơn nữa lại có view nhìn về tu viện cổ kính thời Pháp.\n";
        int ignhahang11 = R.drawable.nh11;
        int ignhahang21 = R.drawable.nh12;
        int ignhahang31 = R.drawable.nh13;

        ArrayList<String> nhang2 = new ArrayList<>();
        String nhahang2 ="The May Restaurant";
        String ngaydangnhahang2 =" Lô D3 KQH Bà Triệu, phường 4, thành phố Đà Lạt.";
        String nguoidangnhahang2 ="0898.911.199";
        String nhahang12 ="Đà Lạt thì ngoài cảnh đẹp còn có món ăn ngon nữa đó nha. Nhưng mà ăn gì thì ăn, phải biết chọn chỗ ăn thì mới không ôm thất vọng được. Hôm nay Hoa Dalat Travel sẽ review tới bạn một địa điểm ăn ngon “nức nở” tại Đà Lạt.\n" +
                "\n" +
                "The May Restaurant là một trong các nhà hàng chuyên cung cấp các món ăn ngon. Không những đồ ăn ngon, giá lại phải chăng. Chỉ từ 55.000 thôi nhé! Ngoài ra, nơi đây cũng nhận đặt món theo yêu cầu. Bạn ăn gì cứ alo cho The May là được tư vấn tận tình, phục vụ tận răng luôn.\n";
        String nhahang22 ="Thực đơn đa dạng với các món Việt của 3 miền Việt Nam. Đầy đủ từ bò, heo, gà, lươn, ếc, cá, tôm, mực,…. Và nếu bạn muốn ăn những món mà The May không có sẵn. Thì có thể alo ngay vào hotline của The May Restaurant để đặt món trước khi đến.\n" +
                "Một điểm cộng cho The May Restaurant chính là có dịch vụ cho thuê phòng ăn. Phù hợp với các gia đình có trẻ nhỏ. Các đối tượng thực khách thích riêng tư, các đồng nghiệp, đối tác làm ăn,….\n" +
                "Dịch vụ ở đây cứ phải gọi là “chuẩn đét” nha. Bàn ghế, không gian sạch sẽ. Nhân viên chu đáo, nhiệt tình. Gọi ngay vào hotline để được The May Restaurant tư vấn cụ thể nhé!\n";
        int ignhahang12 = R.drawable.nh31;
        int ignhahang22 = R.drawable.nh32;
        int ignhahang32 = R.drawable.nh33;

        ArrayList<String> nhang3 = new ArrayList<>();
        String nhahang3 ="Nhà hàng Nhà Tôi";
        String ngaydangnhahang3 =" 18 đường Nguyễn Viết Xuân, phường 4, Thành phố Đà Lạt.";
        String nguoidangnhahang3 ="0913 181 331";
        String nhahang13 ="Nhà hàng Nhà Tôi được thiết kế theo một phong cách kiến trúc. Với không gian rất ấm cúng, sang trọng, sức chứa có thể lên đến 200 khách.";
        String nhahang23 ="Thức ăn tại Nhà Tôi được đánh giá là ngon. Nhân viên phục vụ rất nhiệt tình và chu đáo. Trong trường hợp đoàn các bạn có nhu cầu đặt ăn tại đây thì nên chú ý. Nhắc nhà hàng điều chỉnh khẩu vị ăn của từng vùng miền khác nhau.\n" +
                "\n" +
                "Nhà hàng Nhà Tôi Đà Lạt rất thích hợp với những bữa ăn tối sang trọng. Với không gian thơ mộng và ấm cúng cực kỳ thích hợp với những đoàn khách gia đình.";
        int ignhahang13 = R.drawable.nh21;
        int ignhahang23 = R.drawable.nh22;
        int ignhahang33 = R.drawable.nh23;

        ArrayList<String> nhang4 = new ArrayList<>();
        String nhahang4 ="Nhà hàng cơm niêu Hương Việt";
        String ngaydangnhahang4 =" 41 Đường Sương Nguyệt Ánh, Phường 9, Thành phố Đà Lạt, Lâm Đồng";
        String nguoidangnhahang4 =" 0914 821 039";
        String nhahang14 ="Đây là một trong những nhà hàng mới những đã được rất nhiều quý du khách trong và ngoài nước lựa chọn. Nhà hàng làm điểm dừng chân ăn uống cho đoàn và gia đình của mình.\n" +
                "\n" +
                "Đặc biệt, nhà hàng có phục vụ khách lẻ từ 1 đến 2 khách. Cùng với đó là những bữa cơm gia đình, cơm đoàn với không gian rất ấm cúng và thân mật.";
        String nhahang24 ="Hương Việt nằm tại một vị trí đắc địa, cực kỳ thuận lợi cho quý du khách. Gần với vườn hoa thành phố và hồ Xuân Hương, lại có sân đậu xe ôtô từ 4-45 chỗ ngồi.\n" +
                "\n" +
                "Nhà hàng được thiết kế có không gian sân vườn, vườn hoa. Khung cảnh và cách bày trí ấm cúng, gần gũi, thoáng mát…\n" +
                "\n" +
                "Địa chỉ Nhà hàng cơm niêu Hương Việt: tọa lạc tại số 41 đường Sương Nguyệt Ánh, phường 9, Thành phố Đà Lạt.";
        int ignhahang14 = R.drawable.nh41;
        int ignhahang24 = R.drawable.nh42;
        int ignhahang34 = R.drawable.nh43;

        ArrayList<String> nhang5 = new ArrayList<>();
        String nhahang5 ="Nhà hàng Song Mây";
        String ngaydangnhahang5 ="49 Đường Trần Quang Khải, Phường 8, Thành phố Đà Lạt, Lâm Đồng";
        String nguoidangnhahang5 ="0263 3552 879";
        String nhahang15 ="Ngắm cảnh ở Đà Lạt qua ô cửa kính là một nghệ thuật để thấy hết được vẻ đẹp nơi phố núi. Ngồi ăn ngon ở Song Mây và ngắm cảnh, một trải nghiệm thú vị cho chuyến hành trình của mình";
        String nhahang25 ="“Không gian là một trong những yếu tố tạo nên hương vị của món ăn” Một món ăn ngon là sự thành công của sự hợp tác từ người đầu bếp cho đến người set up. Bạn sẽ cảm thấy quyến luyến nahf hàng này nhất lại ở không gian thiết kế siêu đẹp với kiểu nhà mái ngói truyền thống, đèn lồng đỏ xe lẫn cùng đèn LED, cửa kính hiện đại cho không gian lung linh, lãng mạn không ngờ.";
        int ignhahang15 = R.drawable.nh51;
        int ignhahang25 = R.drawable.nh52;
        int ignhahang35 = R.drawable.nh53;


        ArrayList<String> nhang6 = new ArrayList<>();
        String nhahang6 ="Nhà hàng Đà Lạt Xưa";
        String ngaydangnhahang6 =" 96B Đ. Hùng Vương, Phường 11, Thành phố Đà Lạt, Lâm Đồng";
        String nguoidangnhahang6 ="094 975 38 73";
        String nhahang16 ="Một Đà Lạt xưa yên bình, mang một nét cổ điển riêng xưa được hồi chiếu lại qua chiếc đồng hồ thời gian mang tên nhà hàng ‘Đà Lạt xưa”. Nhưng có phần cải cách một cách sang trọng hiện đại hơn. Bởi không gian rộng lớn, bàn ăn đặt cách xa, có không gian riêng phục vụ cho mục đích tổ chức sinh nhật, hội họp, liên hoan.";
        String nhahang26 ="Thực đơn nơi đây miền nào cũng có cho quý khách dễ dàng lựa chọn. Hương vị nơi đây chắc chắn sẽ khiến quý khách hài lòng.";
        int ignhahang16 = R.drawable.nh61;
        int ignhahang26 = R.drawable.nh62;
        int ignhahang36 = R.drawable.nh63;

        ArrayList<String> nhang7 = new ArrayList<>();
        String nhahang7 ="Nhà hàng Léguda buffet rau Đà Lạt";
        String ngaydangnhahang7 ="lầu 1, Khu du lịch Cáp Treo, Đồi Robin, phường 3, Thành phố Đà Lạt.";
        String nguoidangnhahang7 ="02633 50 72 82";
        String nhahang17 ="Các bạn không cần phải vội vàng lên cáp treo làm gì. Mà chỉ cần đứng ngay tại đây là có thể chiêm ngưỡng được trọn vẹn toàn cảnh Thành phố thơ mộng, yên bình. Đặc biết nhất là lúc về đêm sẽ mang lại một cảm giác lung linh huyền ảo…";
        String nhahang27 ="Vừa được ăn rau thỏa thích với rất nhiều loại rau tươi xanh, ngon tuyệt của Đà Lạt. Vừa được xum họp quây quần bên gia đình bên cạnh nồi lẩu nóng hổi ngon tuyệt. Cùng nhau thưởng thức và ngắm nhìn toàn cảnh Đà Lạt rất bình yên và thơ mộng.";
        int ignhahang17 = R.drawable.nh71;
        int ignhahang27 = R.drawable.nh72;
        int ignhahang37 = R.drawable.nh73;

        Bundle n1= new Bundle();
        n1.putStringArrayList("arraynhahang",nhang1);
        n1.putString("nhahang",nhahang1);
        n1.putString("nguoidangnhahang",nguoidangnhahang1);
        n1.putString("nhahang1",nhahang11);
        n1.putString("ngaydangnhahang",ngaydangnhahang1);
        n1.putString("nhahang2",nhahang21);
        n1.putInt("ignhahang1", ignhahang11);
        n1.putInt("ignhahang2", ignhahang21);
        n1.putInt("ignhahang3", ignhahang31);

        Bundle n2= new Bundle();
        n2.putStringArrayList("arraynhahang",nhang2);
        n2.putString("nhahang",nhahang2);
        n2.putString("nguoidangnhahang",nguoidangnhahang2);
        n2.putString("nhahang1",nhahang12);
        n2.putString("nhahang2",nhahang22);
        n2.putInt("ignhahang1", ignhahang12);
        n2.putInt("ignhahang2", ignhahang22);
        n2.putInt("ignhahang3", ignhahang32);
        n2.putString("ngaydangnhahang",ngaydangnhahang2);

        Bundle n3= new Bundle();
        n3.putStringArrayList("arraynhahang",nhang3);
        n3.putString("nhahang",nhahang3);
        n3.putString("nguoidangnhahang",nguoidangnhahang3);
        n3.putString("nhahang1",nhahang13);
        n3.putString("nhahang2",nhahang23);
        n3.putInt("ignhahang1", ignhahang13);
        n3.putInt("ignhahang2", ignhahang23);
        n3.putInt("ignhahang3", ignhahang33);
        n3.putString("ngaydangnhahang",ngaydangnhahang3);

        Bundle n4= new Bundle();
        n4.putStringArrayList("arraynhahang",nhang4);
        n4.putString("nhahang",nhahang4);
        n4.putString("nguoidangnhahang",nguoidangnhahang4);
        n4.putString("nhahang1",nhahang14);
        n4.putString("nhahang2",nhahang24);
        n4.putInt("ignhahang1", ignhahang14);
        n4.putInt("ignhahang2", ignhahang24);
        n4.putInt("ignhahang3", ignhahang34);
        n4.putString("ngaydangnhahang",ngaydangnhahang4);

        Bundle n5= new Bundle();
        n5.putStringArrayList("arraynhahang",nhang1);
        n5.putString("nhahang",nhahang5);
        n5.putString("nguoidangnhahang",nguoidangnhahang5);
        n5.putString("nhahang1",nhahang15);
        n5.putString("nhahang2",nhahang25);
        n5.putInt("ignhahang1", ignhahang15);
        n5.putInt("ignhahang2", ignhahang25);
        n5.putInt("ignhahang3", ignhahang35);
        n5.putString("ngaydangnhahang",ngaydangnhahang5);

        Bundle n6= new Bundle();
        n6.putStringArrayList("arraynhahang",nhang6);
        n6.putString("nhahang",nhahang6);
        n6.putString("nguoidangnhahang",nguoidangnhahang6);
        n6.putString("nhahang1",nhahang16);
        n6.putString("nhahang2",nhahang26);
        n6.putInt("ignhahang1", ignhahang16);
        n6.putInt("ignhahang2", ignhahang26);
        n6.putInt("ignhahang3", ignhahang36);
        n6.putString("ngaydangnhahang",ngaydangnhahang6);

        Bundle n7= new Bundle();
        n7.putStringArrayList("arraynhahang",nhang7);
        n7.putString("nhahang",nhahang7);
        n7.putString("nguoidangnhahang",nguoidangnhahang7);
        n7.putString("nhahang1",nhahang17);
        n7.putString("nhahang2",nhahang27);
        n7.putInt("ignhahang1", ignhahang17);
        n7.putInt("ignhahang2", ignhahang27);
        n7.putInt("ignhahang3", ignhahang37);
        n7.putString("ngaydangnhahang",ngaydangnhahang7);

        ArrayList<Bundle> bundleArrayList = new ArrayList<>();
        bundleArrayList.add(n1);
        bundleArrayList.add(n2);
        bundleArrayList.add(n3);
        bundleArrayList.add(n4);
        bundleArrayList.add(n5);
        bundleArrayList.add(n6);
        bundleArrayList.add(n7);
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NhaHangFragment.this.getActivity(), Noidung_Nhahang.class);
                intent.putExtras(bundleArrayList.get(position));
                startActivity(intent);
            }

        });


        return view;

    }

}