package br.com.fiap.model.coins;

import br.com.fiap.cache.CryptoPriceCache;

public class CoinCrypto {

    private final CurrencyPair currencyPair;
    private final String currencyBase = "usd";

    private double coinPrice = -1;

    public CoinCrypto(CurrencyPair currencyPair) {
        this.currencyPair = currencyPair;
    }

    public void fetchPrices(CryptoPriceCache cache) {
        this.coinPrice = cache.getPrice(currencyPair.getSymbol(), currencyBase);
    }

    public double getCoinPrice() {
        return coinPrice;
    }

    public String coinData() {
        return "PRECO do " + currencyPair.getSymbol().toUpperCase() + " em " + currencyBase.toUpperCase() + ": " + getCoinPrice();
    }
}