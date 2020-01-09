package id.ac.poliban.dts.hendra.customlistview;

import java.util.ArrayList;
import java.util.List;

public class CountryData {

    static List<Country> getAllCountry(){
        List<Country> data = new ArrayList<>();
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/125px-Flag_of_Indonesia.svg.png", "Indonesia", "officially the Republic of Indonesia (Indonesian: Republik Indonesia [reˈpublik ɪndoˈnesia]),[a] is a country in Southeast Asia, between the Indian and Pacific oceans. It is the world's largest island country, with more than seventeen thousand islands,[11] and at 1,904,569 square kilometres (735,358 square miles), the 14th largest by land area and 7th in the combined sea and land area.[12] With over 261 million people, it is the world's 4th most populous country as well as the most populous Muslim-majority country.[13] Java, the world's most populous island,[14] is home to more than half of the country's population."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png", "United States", "The United States of America (USA), commonly known as the United States (U.S. or US) or simply America, is a country comprising 50 states, a federal district, five major self-governing territories, and various possessions.[i] At 3.8 million square miles (9.8 million km2), the United States is the world's third or fourth largest country by total area[d] and is slightly smaller than the entire continent of Europe. With a population of over 327 million people, the U.S. is the third most populous country. The capital is Washington, D.C., and the most populous city is New York City. Most of the country is located contiguously in North America between Canada and Mexico."));
        data.add(new Country("https://en.wikipedia.org/wiki/File:Flag_of_Malaysia.svg", "Malaysia", " is a country in Southeast Asia. The federal constitutional monarchy consists of 13 states and three federal territories, separated by the South China Sea into two similarly sized regions, Peninsular Malaysia and East Malaysia (Malaysian Borneo). Peninsular Malaysia shares a land and maritime border with Thailand and maritime borders with Singapore, Vietnam, and Indonesia. East Malaysia shares land and maritime borders with Brunei and Indonesia and a maritime border with the Philippines and Vietnam. Kuala Lumpur is the national capital and largest city while Putrajaya is the seat of the federal government. With a population of over 30 million, Malaysia is the world's 44th most populous country. The southernmost point of continental Eurasia, Tanjung Piai, is in Malaysia. In the tropics, Malaysia is one of 17 megadiverse countries, home to large numbers of endemic species."));
        return data;

    }

}
