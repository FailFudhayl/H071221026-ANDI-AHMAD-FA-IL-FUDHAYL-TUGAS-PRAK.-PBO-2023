package NO2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, Double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    private void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        // TODO (1)
        int howLongToType = (int) (60000 / wpm);

        // TODO (2)
        for (String words : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                addWordTyped(words);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordTyped("(selesai)");
        // TODO (3)
        typeRacer.addResult(this);
    }
}

class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    // word by Yusuf Syam, silahkan diubah jika kurang bijak
    private String[] wordsToTypeList = { "Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan danmenginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai" };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4)
    public void addResult(Typer typer) {
        int waktu = (int) (60000 / typer.getWpm()) * typer.getWordsTyped().split(" ").length;
        Result result = new Result(typer.getBotName(), waktu);
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasmen Akhir Type Racer");
        System.out.println("=========================\n");
        // TODO (5)
        for (int i = 0; i < raceStanding.size(); i++) {
            int timeint = raceStanding.get(i).getFinishTime();
            Double timedob = new Double(timeint);
            Double timefix = Double.valueOf(timedob) / 1000;
            System.out.println(String.format("%d. %s = %.2f detik", i + 1, raceStanding.get(i).getName(), timefix));
        }
    }

    public void startRace() {
        // TODO (6)
        setNewWordsToType();
        for (Typer typerss : raceContestant) {
            typerss.start();
        }

        // TODO (7)
        Boolean isFinish = false;
        while (true) {
            if (isFinish) {
                break;
            } else {
                if (raceStanding.size() != raceContestant.size()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Typing Progress....");
                    System.out.println("===================");
                    for (Typer pembalap : raceContestant) {
                        System.out.println(
                                String.format("- %s  =>  %s", pembalap.getBotName(), pembalap.getWordsTyped()));
                    }
                } else {
                    isFinish = true;
                }
            }
        }
        // TODO (8)
        printRaceStanding();
    }
}

public class No2 {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[1] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70.0, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
