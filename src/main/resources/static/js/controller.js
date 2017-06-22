app.controller('mainController', function($scope){
    $scope.message = 'Here is Order data';
});

app.controller('orderDetailsController', function($scope){
    $scope.message = 'Here is Order data';
});


app.controller('unfulfilledOrderDetailsController', function($scope){

    $scope.orderDetail = function(){
        $scope.orderDetails = [
            {
                "itemCode": 1,
                "itemDesc": "test item",
                "quantity": 1,
                "price": "100 Rs"
            },
            {
                "itemCode": 2,
                "itemDesc": "test item",
                "quantity": 1,
                "price": "100 Rs"
            }, {
                "itemCode": 3,
                "itemDesc": "test item",
                "quantity": 1,
                "price": "100 Rs"
            }
        ]
    };

    $scope.remove = function(name){
        var index = -1;
        var comArr = eval( $scope.orderDetails );
        for( var i = 0; i < comArr.length; i++ ) {
            if( comArr[i].name === name ) {
                index = i;
                break;
            }
        }
        if( index === -1 ) {
            alert( "Something gone wrong" );
        }
        $scope.orderDetails.splice( index, 1 );
    };

});