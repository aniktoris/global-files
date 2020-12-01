package com.example.internetprovider.entity;

public enum Tariffs {
    TELEPHONE_TARIFF, INTERNET_TARIFF, CABLETV_TARIFF, IPTV_TARIFF;

    public enum TELEPHONE_TARIFF {
        BUSINESS, ECONOMY;
    }

    public enum INTERNET_TARIFF {
        DAY100GB, DAY7GB, DAY2GB, NIGHT100GB, NIGHT50GB;
    }

    public enum CABLETV_TARIFF {
        SMART, ORDINARY;
    }

    public enum IPTV_TARIFF {
        SMART, ORDINARY;
    }
}
