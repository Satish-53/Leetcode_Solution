int maximumWealth(int** accounts, int accountsSize, int* accountsColSize){
     int maxWealth = 0;
    for (int i = 0; i < accountsSize; i++){
        int totalMoney = 0;
        for (int j = 0; j < accountsColSize[i]; j++){
            totalMoney = totalMoney + accounts[i][j];
        }
        if (totalMoney > maxWealth){
            maxWealth = totalMoney;
        }
    }
    return maxWealth;
}