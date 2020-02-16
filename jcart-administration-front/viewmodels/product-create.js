var app = new Vue({
    el: '#app',
    data: {
        productCode: '',
        productName: '',
        description: '',
        price: '',
        discount: '',
        quantity: '',
        rewordPoints: '',
        statuses: [
            { value: 0, label: '下架' },
            { value: 1, label: '上架' },
            { value: 2, label: '待审核' }
        ],
        selectedStatus: 1
    },
    methods: {
        handleCreateClick() {
            console.log('create click');
            this.createProduct();
        },
        createProduct() {
            axios.post('/product/create', {
                productCode: this.productCode,
                productName: this.productName,
                price: this.price,
                discount: this.discount,
                quantity: this.quantity,
                status: this.selectedStatus,
                rewordPoints: this.rewordPoints,
                description: this.description
            })
                .then(function (response) {
                    console.log(response);
                    alert('创建成功');
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})