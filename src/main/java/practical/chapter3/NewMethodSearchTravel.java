package practical.chapter3;

import java.util.ArrayList;
import java.util.List;

public class NewMethodSearchTravel {
    public static final String COUNTRY_VIETNAM = "vietnam";
    public static final String COUNTRY_PHILLIPHINE = "philliphine";
    public static final String COUNTRY_TAILAND = "tailand";

    //여행 상품 저장
    private List<TravelInfo> travelInfoList = new ArrayList<TravelInfo>();

    public NewMethodSearchTravel() {
        initializeProduct();
    }

    //데이터를 초기화하며 외부에서 호출하지 못하도록 private 선언
    private void initializeProduct() {
        TravelInfo cebu = new TravelInfo();
        cebu.setName("Cebu Travel");
        cebu.setCountry(COUNTRY_PHILLIPHINE);
        cebu.setCity("cebu");
        cebu.setDays(5);
        cebu.setNights(3);
        travelInfoList.add(cebu);

        TravelInfo boracay = new TravelInfo();
        boracay.setName("Boracay Travel");
        boracay.setCountry(COUNTRY_PHILLIPHINE);
        boracay.setCity("boracay");
        boracay.setDays(5);
        boracay.setNights(3);
        travelInfoList.add(boracay);

        TravelInfo hanoi = new TravelInfo();
        hanoi.setName("Hanoi Travel");
        hanoi.setCountry(COUNTRY_VIETNAM);
        hanoi.setCity("hanoi");
        hanoi.setDays(3);
        hanoi.setNights(2);
        travelInfoList.add(hanoi);

        TravelInfo danang = new TravelInfo();
        danang.setName("Danang Travel");
        danang.setCountry(COUNTRY_VIETNAM);
        danang.setCity("danang");
        danang.setDays(6);
        danang.setNights(4);
        travelInfoList.add(danang);

        TravelInfo bankok = new TravelInfo();
        bankok.setName("Bankok Travel");
        bankok.setCountry(COUNTRY_TAILAND);
        bankok.setCity("bankok");
        bankok.setDays(5);
        bankok.setNights(3);
        travelInfoList.add(bankok);
    }

    public List<TravelInfo> searchTravelInfoByCoutry(String country) {
        List<TravelInfo> returnValue = new ArrayList<>();

        for(TravelInfo travelInfo : travelInfoList) {
            if(country.equals(travelInfo.getCountry())) {
                returnValue.add(travelInfo);
            }
        }
        return returnValue;
    }

    public List<TravelInfo> searchTravelInfoByCity(String city) {
        List<TravelInfo> returnValue = new ArrayList<>();

        for(TravelInfo travelInfo : travelInfoList) {
            if(city.equals(travelInfo.getCity())) {
                returnValue.add(travelInfo);
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {
        NewMethodSearchTravel travelSearch = new NewMethodSearchTravel();

        //국가명 기준
        List<TravelInfo> searchListByCountry =
                travelSearch.searchTravelInfoByCoutry("vietnam");

        for(TravelInfo searchTravel : searchListByCountry) {
            System.out.println(searchTravel);
        }

        //도시명 기준
        List<TravelInfo> searchListByCity =
                travelSearch.searchTravelInfoByCity("cebu");

        for(TravelInfo searchTravel : searchListByCity) {
            System.out.println(searchTravel);
        }
    }
}

