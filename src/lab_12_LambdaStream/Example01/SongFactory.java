package lab_12_LambdaStream.Example01;

import java.util.List;

public class SongFactory {

    public static List<Song> getSongs(){
        return List.of(
                new Song("$10","Hitchhiker","Electronic",2016,1983),
                new Song("Havana","Camila Cabello","R&B",2017,324),
                new Song("Cassidy","Greatful Dead","Rock",1972,123),
                new Song("50 ways","Paul Simon","Soft Rock",1975,199),
                new Song("Hurt","Nine Inch Nails","Industrial Rock",1995,257),
                new Song("Silence","Delerium","Electronic",1999,134),
                new Song("Watercolor","Pendulum","Electronic",2010,155),
                new Song("The Outsider","A Perfect Circle","Alternative Rock",2004,312),
                new Song("Come Together","The Beatles","Blues rock",1968,173),
                new Song("Immigrant Song","Karen O","Industrial Rock",2011,12),
                new Song("Breathe","The Prodigy","Electronic",1996,337),
                new Song("What is going on","Gaye","R&B",1971,420),
                new Song("Hallucinate","Dua Lipa","Pop",2019,495),
                new Song("Walk me home","P!nk","Pop",2019,459)
        );
    }
}
