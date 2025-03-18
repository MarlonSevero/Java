package br.com.cryptocoin.coins.coin;

import br.com.cryptocoin.coins.model.Crypto;
import br.com.cryptocoin.fetcher.CryptoPriceFetcher;

public class CoinDog extends Crypto{

    private final Crypto crypto = new Crypto();
    private final double coinPriceDogCoinUsd = CryptoPriceFetcher.getCryptoPrice(crypto.getDog(), crypto.getUsd());
    private final double coinPriceDogCoinBrl = CryptoPriceFetcher.getCryptoPrice(crypto.getDog(), crypto.getBrl());

    public double getCoinPriceDogCoinBrl() {return coinPriceDogCoinBrl;}

    public double getCoinPriceDogCoinUsd() {return coinPriceDogCoinUsd;}

    public String dogDataBrl(){
        return "PRECO do " + crypto.getDog() + " em " +
                "" + crypto.getBrl().toUpperCase() + ":" + getCoinPriceDogCoinBrl();
    }

    public String dogDataUsd(){
        return "PRECO do " + crypto.getDog() + " em " +
                "" + crypto.getUsd().toUpperCase() + ":" + getCoinPriceDogCoinUsd();
    }
}
