package com.sha.microservice3gateway.service;

import com.google.gson.JsonElement;
import com.sha.microservice3gateway.request.ITransactionServiceRequest;
import com.sha.microservice3gateway.util.RetrofitUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionService implements ITransactionService
{
    @Autowired
    private ITransactionServiceRequest transactionServiceRequest;

    @Override
    public JsonElement saveTransaction(JsonElement transaction)
    {
        return RetrofitUtils.executeInBlock(transactionServiceRequest.saveTransaction(transaction));
    }

    @Override
    public void deleteTransaction(Long transactionId)
    {
        RetrofitUtils.executeInBlock(transactionServiceRequest.deleteTransaction(transactionId));
    }

    @Override
    public List<JsonElement> getAllTransactionsOfUser(Long userId)
    {
        return RetrofitUtils.executeInBlock(transactionServiceRequest.getAllTransactionsOfAuthorizedUser(userId));
    }
}