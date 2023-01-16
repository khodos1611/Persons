import java.util.Random;

public class GeneratingObjects {

        public static Person[] Generate(int countOfPerson){

            Person [] peoples = new Person[countOfPerson];

            String [] names = new String[]{"Chandler","Joe","Ross","Monika","Rachel", "Phebee"};
            String [] surnames = new String[]{"Bing","Tribiani","Geller","Geller","Green", "Boufe"};

            //1 - "phone", 2 -"day",3 - "month",4 - "year",5 - "weight",6 - "pressureTop", 7 - "pressureBottom",8 -"stepsCount"
            Object [] data = new Object[8];

            for (int i = 0; i < peoples.length; i++) {

                GenerateRandomData(data);
                peoples[i] = new Person(names[i],
                        surnames[i],
                        "mail"+i+"@gmail.com",
                        (String) data[0],
                        (Integer) data[1],
                        (Integer) data[2],
                        (Integer) data[3],
                        (Integer) data[4],
                        (Integer) data[5],
                        (Integer) data[6],
                        (Integer) data[7]);
            }

            return peoples;
        }

        public static void GenerateRandomData(Object [] data){

            for (int i = 1; i <= data.length; i++) {
                switch (i){
                    case 1 : {
                        String number = "";
                        for (int j = 0; j < 9; j++) {
                            number += GenerateInt(0,9);
                        }
                        data[i-1] = number;
                        break;
                    }
                    case 2 : { data[i-1] = GenerateInt(1,31);break;}
                    case 3 : { data[i-1] = GenerateInt(1,12);break;}
                    case 4 : { data[i-1] = GenerateInt(1978,2003);break;}
                    case 5 : { data[i-1] = GenerateInt(50,120);break;}
                    case 6 : { data[i-1] = GenerateInt(80,120);break;}
                    case 7 : { data[i-1] = GenerateInt(50,90); break;}
                    case 8 : { data[i-1] = GenerateInt(500,10000);break;}

                }
            }
        }

        public static int GenerateInt(int min, int max){
            Random random = new Random();
            return min+random.nextInt((max - min) + 1);
        }

    }

