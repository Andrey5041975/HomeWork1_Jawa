import javax.sound.midi.Soundbank;

public class NewPlanets {
    public static void main (String...args){
        Planet plMercury = new Planet ();
        plMercury.name = "Меркурий (Mercury)";
        System.out.println("Планета " + plMercury.name + " Спутников не имеет");
        System.out.println("Наименьшая планета Солнечной системы и самая близкая к Солнцу");
        System.out.println();

        Planet plVenus = new Planet();
        plVenus.name = "Венера (Venus)";
        System.out.println("Планета " + plVenus.name + " Спутников не имеет");
        System.out.println("Вторая по удаленности от солнца. Названа в честь древнеримской богини любви.");
        System.out.println();

        Planet plEarth = new Planet();
        plEarth.name = "Земля (Earth)";
        plEarth.namesOfMoons =new String[]{"Луна"};
        plEarth.numberOfMoons = 1;
        System.out.println("Планета " + plEarth.name + " Спутник " + plEarth.numberOfMoons + " " + plEarth.namesOfMoons[0]);
        System.out.println("Третья по удаленности от солнца. Самая плотная, пятая по диаметру и массе среди всех планет солнечной системы.");
        System.out.println();

        Planet plMars = new Planet();
        plMars.name = "Марс (Mars)";
        System.out.println("Планета " + plMars.name);
        System.out.println("Четвертая по удаленности от солнца. Названа в честь Марса - древнеримского бога войны. Также называют красной планетой. ");
        System.out.println();

        Planet plJupiter = new Planet();
        plJupiter.name = "Юпитер (Jupiter)";
        plJupiter.numberOfMoons = 95;
        plJupiter.namesOfMoons = new String[] {"Ио,", "Европа,", "Ганимед,", "Каллисто"};
        System.out.println(plJupiter.name + "- крупнейшая планета Солнечной системы, пятая по удаленности от Солнца. Наряду с Сатурном Юритер классифицируется как газовый гигант");
        System.out.println("Число спутников " + plJupiter.numberOfMoons);
        System.out.println("Четыре наиболее крупных спутника: " + plJupiter.namesOfMoons[0] + " " + plJupiter.namesOfMoons[1] + " " + plJupiter.namesOfMoons[2] + " " +plJupiter.namesOfMoons[3]);
        System.out.println();

        Planet plSaturn = new Planet();
        plSaturn.name = "Сатурн (Saturn)";
        plSaturn.numberOfMoons = 63;
        plSaturn.namesOfMoons = new String[]{"Самый большой спутник Сатурна (и второй во всей Солнечной системе после Ганимеда) — Титан"};
        System.out.println(plSaturn.name + " шестая по удаленности от солнца и вторая по размерам после Юпитера. Названа в честь римского бога земледелия.");
        System.out.println("Количество спутников " + plSaturn.numberOfMoons + " 24 спутника Сатурна - регулярные, остальные 59 - нерегулярные ");
        System.out.println(plSaturn.namesOfMoons[0]);
        System.out.println();

        Planet plUranus = new Planet();
        plUranus.name = "Уран (Uranus)";
        plUranus.numberOfMoons = 27;
        plUranus.namesOfMoons = new String[]{"Титания", "Оберон", "Ариэль", "Умбриэль", "Миранда"};
        System.out.println(plUranus.name + "седьмая по удалённости от Солнца, третья по диаметру и четвёртая по массе");
        System.out.println("Количество спутников "+plUranus.numberOfMoons);
        System.out.println("Имена самых крупных: " + plUranus.namesOfMoons[0] + " " + plUranus.namesOfMoons[1] + " " +plUranus.namesOfMoons[2] + " " +plUranus.namesOfMoons[3] + " " +plUranus.namesOfMoons[4]);
        System.out.println();

        Planet plNeptun = new Planet();
        plNeptun.name = "Нептун (Neptun)";
        plNeptun.numberOfMoons = 14;
        plNeptun.namesOfMoons = new String[]{"Тритон, ", "Нереида, ", "Протей, ", "Ларисса, ", "Дестпина, ", "Галатея, ", "Таласса, ", "Наяда"};
        System.out.println(plNeptun.name + " восьмая и самая дальняя от Солнца планета, названа в честь Нептуна — римского бога морей. ");
        System.out.println("Количество спутников "+plNeptun.numberOfMoons);
        System.out.println("Имена самых крупных: " + plNeptun.namesOfMoons[0] + " " + plNeptun.namesOfMoons[1] + " " +plNeptun.namesOfMoons[2] + " " +plNeptun.namesOfMoons[3] + " " +plNeptun.namesOfMoons[4] + " " +plNeptun.namesOfMoons[5] + " " +plNeptun.namesOfMoons[6] + " " +plNeptun.namesOfMoons[7]);
        System.out.println();
    }


}
