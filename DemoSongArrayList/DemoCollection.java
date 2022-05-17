package DemoSongArrayList;

import java.util.*;


 class DemoCollection {
    private String singer;
    private String song;
    private int age;
    private int nsx;
    private int view;

private DemoCollection(String singer,String song,int age,int nsx,int view){
    this.singer=singer;
    this.song=song;
    this.age=age;
    this.nsx=nsx;
    this.view=view;
}
    public String getSinger() {
        return singer;
    }

    public String getSong() {
        return song;
    }

    public int getAge() {
        return age;
    }

    public int getNsx() {
        return nsx;
    }

    public int getView() {
        return view;
    }

    @Override
    public String toString() {
        return "DemoCollection{" +
                "singer='" + singer + '\'' +
                ", song='" + song + '\'' +
                ", age=" + age +
                ", nsx=" + nsx +
                ", view=" + view +
                '}';
    }
    public static class Song {
        public static void main(String[] args) {
            List<DemoCollection> DemoSong = new ArrayList<>();
            DemoSong.add(new DemoCollection("Son Tung", "Chạy ngay đi", 25, 2017, 27591768));
            DemoSong.add(new DemoCollection("Manh Quynh", "Vợ người ta", 27, 2018, 14687345));
            DemoSong.add(new DemoCollection("Hoang Son", "Phía sau một cô gái", 25, 2015, 8967498));
            DemoSong.add(new DemoCollection("Quang Hieu", "Nơi ấy con tìm về ", 25, 2016, 7830980));
            // Duyet mang
            DemoSong.forEach(DemoCollection -> {
                System.out.println("Singer: " + DemoCollection.getSinger());
                System.out.println("Song: " + DemoCollection.getSong());
                System.out.println("Age: " + DemoCollection.getAge());
                System.out.println("NSX: " + DemoCollection.getNsx());
                System.out.println("View: " + DemoCollection.getView());
                System.out.println("================================");
            });


            //iterator()
            System.out.println("Use iterator()");
            Iterator<DemoCollection> DemoSongIterator = DemoSong.iterator();
            while (DemoSongIterator.hasNext()) {
                DemoCollection DemoSongUseIterator = (DemoSongIterator.next());
                System.out.println(DemoSongUseIterator);
            }

            //remove
            DemoSong.remove(0);
            System.out.println("After remove(0) : " + DemoSong);


            //truy cap 1 phan tu bang phuong thuc get()
            System.out.println("truy cap phan tu tu thu hai : " + DemoSong.get(2));


            //them mot phan tu bang phuong thuc set()
            System.out.println("Thêm một phần tử");
            DemoSong.set(2, new DemoCollection("Cao Thái Sơn", "Con Đường mưa", 36, 2017, 7763883));
            DemoSong.forEach(DemoCollection -> {
                System.out.println("Singer: " + DemoCollection.getSinger());
                System.out.println("Song: " + DemoCollection.getSong());
                System.out.println("Age: " + DemoCollection.getAge());
                System.out.println("NSX: " + DemoCollection.getNsx());
                System.out.println("View: " + DemoCollection.getView());
                System.out.println("================================");
            });
            System.out.println("Sắp xếp mảng theo độ tuổi");
            DemoSong.sort((DemoSong1, DemoSong2) -> {
                return DemoSong1.getAge() - DemoSong2.getAge();
            });
            System.out.println("mảng sau khi sắp xếp : "+ DemoSong);
        }
    }
 }


