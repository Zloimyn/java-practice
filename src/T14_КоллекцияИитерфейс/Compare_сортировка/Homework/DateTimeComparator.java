package T14_КоллекцияИитерфейс.Compare_сортировка.Homework;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime>{
    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        if(dt1.year >= dt2.year){
            if (dt1.month >= dt2.month){
                if (dt1.day >= dt2.day){
                    if (dt1.hours >= dt2.hours){
                        if (dt1.minutes >= dt2.minutes){
                            if (dt1.seconds >= dt2.seconds){
                                return 1;
                            }else {
                                return -1;
                            }
                        }else {
                            return -1;
                        }
                    }else {
                        return -1;
                    }
                }else {
                    return -1;
                }
            }else {
                return -1;
            }
        }else {
            return -1;
        }
    }
}
