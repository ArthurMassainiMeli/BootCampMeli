package modulo_5.dia_2.tm;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Data {
    private GregorianCalendar data;

    public Data() {
        this.data = new GregorianCalendar(new Locale("pt-br", "BRA"));
    }

    public void adicionarDiaAData() {
        this.data.add(Calendar.DATE, 1);
    }

    @Override
    public String toString() {
        return "Data: " + data.getTime();
    }

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }
}
