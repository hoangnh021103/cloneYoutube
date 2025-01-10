package UserVIdeo;

import com.example.ASM1.User;

import java.util.ArrayList;
import java.util.List;

public class USerservice {
List<USer>list= new ArrayList<>();
    public USerservice(){
        list.add(new USer("S1","5 sự thật về máy hút bụi thông minh mà bạn sẽ không dám tin","Nội quy công ty là một loại văn bản do người sử dụng lao động ban hành, nhằm cụ thể hóa các quy định chưa được thỏa thuận rõ ràng trong hợp đồng lao động",true,"https://bizweb.dktcdn.net/100/411/628/products/charlie-puth-voicenotes.png?v=1690437571160"));
        list.add(new USer("S2","TOP 5 SỰ THẬT THÚ VỊ MÀ CHƯA CHẮC NHIỀU NGƯỜI ĐÃ BIẾT","Vào năm 2002, tạp chí y khoa Lancet đã đăng một báo cáo của các nhà nghiên cứu ở Đại học Amsterdam, những người đã rà soát các tài liệu khoa học cho các nghiên cứu về việc người ta sẽ ra sao sau khi được đề nghị tư vấn “trong một buổi”. Tại đó những nạn nhân được khuyên bảo về những tác động tâm lý họ có thể gặp phải trong những ngày sắp tới. Các nhà nghiên cứu đã không thể tìm được bất kì chứng cứ nào rằng việc cảnh báo trước như vậy là có lợi.",false,"https://cdns-images.dzcdn.net/images/cover/948200588c813c1afd10f29b56e0ce50/1900x1900-000000-80-0-0.jpg"));
        list.add(new USer("S3","Top 5 Sự Thật Thú Vị Về Loài Hổ Có Thể Bạn Chưa Biết","1. Hổ trắng đều bị lác mắt\n" +
                "\n" +
                "Điều này có vẻ rất phi lí nhưng đó là sự thât. Các loài hổ trắng được sinh ra hầu hết do cận huyết. Chính vì vật bộ gen tạo ra màu trắng đã gây ảnh hưởng đến thị lực của hổ trắng dẫn đến mắt bị lác. Những chú hổ này được lai tạo một cách bất chấp từ con người dẫn đến những chú hổ con màu trắng sinh ra có sức khỏe yếu, thậm chí là bị dị tật và ảnh hưởng đến tính mạng",false,"https://m.media-amazon.com/images/I/71XiIQ45aCL._UF1000,1000_QL80_.jpg"));
    }
    public List<USer> getAll(){return list;}
    public void add(USer u){
        list.add(u);
    }
    public USer findByid(String Id){
        for (USer u :list){
            if (u.getId().equals(Id));
            return u;
        }
        return null;
    }
    public void deleteByID(String Id){
        USer u = findByid(Id);
        if (u!=null){
            list.remove(u);
        }
    }
    public void update(USer u){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(u.getId())){
                list.set(i,u);
            }
        }
    }
}
