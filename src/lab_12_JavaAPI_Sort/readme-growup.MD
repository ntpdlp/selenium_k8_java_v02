String pkg: use the built-in Collections.sort(List_of_String)
    chi dung de so sanh Built-in data such as String, Integer
    Han che: muon so sanh 2 bai hat (title, artistName, doanhThu) , 2 Student(age,name) lam sao?

SongV1 pkg: use <I> Comparable , just able to implement 1 compareTo() from class's itself to another of same type.
    Giai quyet duoc van de o tren     
    Han che: chi co 1 phep so sanh

SongV2 pkg: use <I> Comparator to create custom comparing: title, artistName
    Co the cai thien dc o diem co the tao ra nhieu phep so sanh
    Han che: moi phep so sanh, lai phai tao 1 class

SongV3 pkg: use <I> Comparator with Functional Programming concept
    Viet truc tiep moi khi can so sanh, ko can phai tao lop moi de tao phep toan so sanh

SongV4 pkg: use <I> Comparator in sort() by Lambdas way => don't need to create custom comparator operator
            since the <I> Comparator has only 1 method inside.

SongV5 pkg: 
    Problem: We are using ArrayList -> has duplicate values
    Solution: use HashSet instead, to compare 2 object Song(): need to override equals() & hashCode()
    Remind 2 concepts:
    1) reference equality: same hashcode(), means same reference address memory in the heap
    2) object equality: same hashcode(), same values comparing defining in override equals() 