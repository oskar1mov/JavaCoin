# :moneybag: JavaCoin - A Simple Cryptocurrency in Java

JavaCoin is a learning projects that implements a basic model of cryptocurrency using Java. It showcases core blockcjain concepts such as wallet creation, transaction handling, block mining, and block validation.

## :scroll:	Technologies Used
* [BouncyCastle](https://www.bouncycastle.org/latest_releases.html) for cryptographic operations
* [Google Gson](https://github.com/google/gson/releases) for object-to-JSON serialization 
## :rocket: Features
* Generation of public/private key pairs (wallets)
* Digital signatures and transaction verification
* UTXO-based transaction model
* Mining blocks
* Blockchain integrity validation

## :arrow_right: How it Works
Main workflow from Main.java:
1. Creates wallets (walletA, walletB, and coinbase)
2. Initializes a genesis block, where coinbase sends 100 JavaCoins to walletA
3. Executes test transactions:
   * walletA sends 40 JavaCoins to walletB
   * walletA tries to send 1000 JavaCoins (which exceeds its balance)
   * walletB sends 20 JavaCoins back to walletA
4. Validates the blockchain using isChainValid()


![photo_2025-04-19_00-15-36](https://github.com/user-attachments/assets/a280cfaa-a49f-4e0e-8073-36e8ee72aa37)

