package br.com.cryptocoin.coins.coin;

import br.com.cryptocoin.coins.model.Crypto;
import br.com.cryptocoin.fetcher.CryptoPriceFetcher;

public class CoinBitcoin extends Crypto {

    private final Crypto crypto = new Crypto();
    private final double coinPriceBitcoinUsd = CryptoPriceFetcher.getCryptoPrice(crypto.getBitcoin(), crypto.getUsd());
    private final double coinPriceBitcoinBrl = CryptoPriceFetcher.getCryptoPrice(crypto.getBitcoin(), crypto.getBrl());


    public double getCoinPriceBitcoinUsd() {
        return coinPriceBitcoinUsd;
    }

    public double getCoinPriceBitcoinBrl() {
        return coinPriceBitcoinBrl;
    }

    public String bitcoinDataUsd(){
        return "PRECO do " + getBitcoin() + " em " + crypto.getUsd().toUpperCase() + ":" + coinPriceBitcoinUsd;
    }

    public String bitcoinDataBrl(){
        return "PRECO do " + crypto.getBitcoin() + " em " + crypto.getBrl().toUpperCase() + ":" + coinPriceBitcoinBrl;
    }
}
