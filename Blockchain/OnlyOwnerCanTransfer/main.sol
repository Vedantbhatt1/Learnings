// SPDX-License-Identifier: MIT
 pragma solidity ^0.8.0;
 contract MyToken {
    string public name = "MyToken";
    string public symbol = "MTK";
    uint8 public decimals = 18;
    uint256 public totalSupply;
    mapping(address => uint256) private balances;
    address public owner;
    event Transfer(address indexed from, address indexed to, uint256
 value);
    modifier onlyOwner() {
        require(msg.sender == owner, "Caller is not the owner");
        _;
    }
    constructor(uint256 _initialSupply) {
        totalSupply = _initialSupply * 10**uint256(decimals);
        balances[msg.sender] = totalSupply;
        owner = msg.sender;
        emit Transfer(address(0), msg.sender, totalSupply);
    }
    function balanceOf(address account) public view returns (uint256) {
        return balances[account];
    }
    function transfer(address recipient, uint256 amount) public
 onlyOwner returns (bool) {
        require(recipient != address(0), "Cannot transfer to the zero
 address");
        require(balances[owner] >= amount, "Insufficient balance");
        balances[owner] -= amount;
        balances[recipient] += amount;
        emit Transfer(owner, recipient, amount);
        return true;
    }
