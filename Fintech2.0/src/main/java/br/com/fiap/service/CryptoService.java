package br.com.fiap.service;

import br.com.fiap.cache.CryptoPriceCache;
import br.com.fiap.model.coins.CurrencyPair;
import br.com.fiap.model.coins.CoinCrypto;

public class CryptoService {

    private final CryptoPriceCache cache = CryptoPriceCache.getInstance(); // instância do cache

    public void showValues(int opcaoMoeda) {
        CurrencyPair pair = null;

        switch (opcaoMoeda) {
            case 1:
                pair = CurrencyPair.BITCOIN;
                break;
            case 2:
                pair = CurrencyPair.SOLANA;
                break;
            case 3:
                pair = CurrencyPair.USDT;
                break;
            case 4:
                pair = CurrencyPair.DOGE;
                break;
            case 0:
                System.out.println("Obrigado pela preferencia!");
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        CoinCrypto crypto = new CoinCrypto(pair);

        // Fetch prices from cache
        crypto.fetchPrices(cache); // Atualiza os preços usando o cache

        if (crypto.getCoinPrice() == -1) {
            System.out.println("Erro ao buscar os valores das moedas. Tente novamente mais tarde.");
            return;
        }
        System.out.println(crypto.coinData());
    }
}