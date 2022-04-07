package part1ByAbstractFactory.Creator;

import part1ByAbstractFactory.Product.BatchOfCheck;

public interface Check extends  AccountCre{
    BatchOfCheck check();
}
