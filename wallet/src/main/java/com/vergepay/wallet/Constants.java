package com.vergepay.wallet;

import android.text.format.DateUtils;

import com.vergepay.core.coins.*;
import com.vergepay.core.network.CoinAddress;
import com.vergepay.stratumj.ServerAddress;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author John L. Jegutanis
 * @author Andreas Schildbach
 */
public class Constants {

    public static final int SEED_ENTROPY_DEFAULT = 192;
    public static final int SEED_ENTROPY_EXTRA = 256;

    public static final String ARG_SEED = "seed";
    public static final String ARG_PASSWORD = "password";
    public static final String ARG_SEED_PASSWORD = "seed_password";
    public static final String ARG_EMPTY_WALLET = "empty_wallet";
    public static final String ARG_SEND_TO_ADDRESS = "send_to_address";
    public static final String ARG_SEND_TO_COIN_TYPE = "send_to_coin_type";
    public static final String ARG_SEND_TO_ACCOUNT_ID = "send_to_account_id";
    public static final String ARG_SEND_VALUE = "send_value";
    public static final String ARG_TX_MESSAGE = "tx_message";
    public static final String ARG_COIN_ID = "coin_id";
    public static final String ARG_ACCOUNT_ID = "account_id";
    public static final String ARG_MULTIPLE_COIN_IDS = "multiple_coin_ids";
    public static final String ARG_MULTIPLE_CHOICE = "multiple_choice";
    public static final String ARG_SEND_REQUEST = "send_request";
    public static final String ARG_TRANSACTION_ID = "transaction_id";
    public static final String ARG_ERROR = "error";
    public static final String ARG_MESSAGE = "message";
    public static final String ARG_ADDRESS = "address";
    public static final String ARG_ADDRESS_STRING = "address_string";
    public static final String ARG_EXCHANGE_ENTRY = "exchange_entry";
    public static final String ARG_URI = "test_wallet";
    public static final String ARG_PRIVATE_KEY = "private_key";

    public static final int PERMISSIONS_REQUEST_CAMERA = 0;

    public static final String WALLET_FILENAME_PROTOBUF = "wallet";
    public static final long WALLET_WRITE_DELAY = 5;
    public static final TimeUnit WALLET_WRITE_DELAY_UNIT = TimeUnit.SECONDS;

    public static final long STOP_SERVICE_AFTER_IDLE_SECS = 30 * 60; // 30 mins

    public static final String HTTP_CACHE_NAME = "http_cache";
    public static final int HTTP_CACHE_SIZE = 256 * 1024; // 256 KiB
    public static final int NETWORK_TIMEOUT_MS = 15 * (int) DateUtils.SECOND_IN_MILLIS;

    public static final String TX_CACHE_NAME = "tx_cache";
    public static final int TX_CACHE_SIZE = 5 * 1024 * 1024; // 5 MiB, TODO currently not enforced

    public static final long RATE_UPDATE_FREQ_MS = 30 * DateUtils.SECOND_IN_MILLIS;

    /** Default currency to use if all default mechanisms fail. */
    public static final String DEFAULT_EXCHANGE_CURRENCY = "USD";

    public static final Charset UTF_8 = StandardCharsets.UTF_8;
    public static final Charset US_ASCII = StandardCharsets.US_ASCII;

    public static final char CHAR_HAIR_SPACE = '\u200a';
    public static final char CHAR_THIN_SPACE = '\u2009';
    public static final char CHAR_ALMOST_EQUAL_TO = '\u2248';
    public static final char CHAR_CHECKMARK = '\u2713';
    public static final char CURRENCY_PLUS_SIGN = '+';
    public static final char CURRENCY_MINUS_SIGN = '-';

    public static final String MARKET_APP_URL = "market://details?id=%s";
    public static final String BINARY_URL = "https://github.com/vergecurrency/vergedroid/";

    public static final String VERSION_URL = "https://vergecurrency.com/version.txt";
    public static final String SUPPORT_EMAIL = "@vergecurrency on x.com";

    // TODO move to resource files
    public static final List<CoinAddress> DEFAULT_COINS_SERVERS = ImmutableList.of(
            new CoinAddress(BitcoinMain.get(), new ServerAddress("btc-cce-1.verge.net", 5001, true),
                    new ServerAddress("btc-cce-2.verge.net", 5001, true)),
            new CoinAddress(BitcoinTest.get(), new ServerAddress("btc-testnet-cce-1.verge.net", 15001, true),
                    new ServerAddress("btc-testnet-cce-2.verge.net", 15001, true)),
            new CoinAddress(BurstMain.get(), new ServerAddress("burst-cce-1.verge.net", 5051, true),
                    new ServerAddress("burst-cce-2.verge.net", 5051, true)),
            new CoinAddress(LitecoinMain.get(), new ServerAddress("ltc-cce-1.verge.net", 5002, true),
                    new ServerAddress("ltc-cce-2.verge.net", 5002, true)),
            new CoinAddress(LitecoinTest.get(), new ServerAddress("ltc-testnet-cce-1.verge.net", 15002, true),
                    new ServerAddress("ltc-testnet-cce-2.verge.net", 15002, true)),
            new CoinAddress(NxtMain.get(), new ServerAddress("176.9.65.41", 7876, true),
                    new ServerAddress("176.9.65.41", 7876, true)),
            new CoinAddress(VergeMain.get(), new ServerAddress("xvg-electrum.online", 50002, true),
                    new ServerAddress("xvg-electrum.online", 50002, true))
    );

    public static final HashMap<CoinType, Integer> COINS_ICONS = new HashMap<>();
    public static final HashMap<CoinType, String> COINS_BLOCK_EXPLORERS = new HashMap<>();

    static {
        COINS_ICONS.put(CoinID.BITCOIN_MAIN.getCoinType(), R.drawable.bitcoin);
        COINS_ICONS.put(CoinID.BITCOIN_TEST.getCoinType(), R.drawable.bitcoin_test);
        COINS_ICONS.put(CoinID.LITECOIN_MAIN.getCoinType(), R.drawable.litecoin);
        COINS_ICONS.put(CoinID.LITECOIN_TEST.getCoinType(), R.drawable.litecoin_test);
        COINS_ICONS.put(CoinID.NXT_MAIN.getCoinType(), R.drawable.nxt);
        COINS_ICONS.put(CoinID.BURST_MAIN.getCoinType(), R.drawable.burst);
        COINS_ICONS.put(CoinID.VERGE_MAIN.getCoinType(), R.drawable.verge);

        COINS_BLOCK_EXPLORERS.put(CoinID.BITCOIN_MAIN.getCoinType(), "https://blockchain.info/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.BITCOIN_TEST.getCoinType(), "https://chain.so/tx/BTCTEST/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.LITECOIN_MAIN.getCoinType(), "http://ltc.blockr.io/tx/info/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.LITECOIN_TEST.getCoinType(), "https://chain.so/tx/LTCTEST/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.VERGE_MAIN.getCoinType(), "https://verge-blockchain.info/tx/%s");
    }

    public static final CoinType DEFAULT_COIN = VergeMain.get();
    public static final List<CoinType> DEFAULT_COINS = ImmutableList.of(VergeMain.get());
    public static final ArrayList<String> DEFAULT_TEST_COIN_IDS = Lists.newArrayList(
            BitcoinTest.get().getId(),
            LitecoinTest.get().getId()
    );
    public static final List<CoinType> SUPPORTED_COINS = ImmutableList.of(VergeMain.get());
}
