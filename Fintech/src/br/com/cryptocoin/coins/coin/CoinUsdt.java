package br.com.cryptocoin.coins.coin;

import br.com.cryptocoin.coins.model.Crypto;
import br.com.cryptocoin.fetcher.CryptoPriceFetcher;

public class CoinUsdt {
    private final Crypto crypto = new Crypto();
    private final double coinPriceUsdtUsd = CryptoPriceFetcher.getCryptoPrice(crypto.getUsdt(), crypto.getUsd());
    private final double coinPriceUsdtBrl = CryptoPriceFetcher.getCryptoPrice(crypto.getUsdt(), crypto.getBrl());

    public double getCoinPriceUsdtUsd() {
        return coinPriceUsdtUsd;
    }

    public double getCoinPriceUsdtBrl() {
        return coinPriceUsdtBrl;
    }

    public String usdtDataBrl(){
        return "PRECO do " + crypto.getUsdt() + " em " +
                "" + crypto.getBrl().toUpperCase() + ":" + getCoinPriceUsdtBrl();
    }

    public String usdtDataUsd(){
        return "PRECO do " + crypto.getUsdt() + " em " +
                "" + crypto.getUsd().toUpperCase() + ":" + getCoinPriceUsdtUsd();
    }
}
