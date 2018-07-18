Ext.define('Crud.Application', {
    name: 'Crud',
    appFolder: 'mvcCrudApp',
    extend: 'Ext.app.Application',

    stores: [
        'Employees'
    ],

    views: [
        'Main'
    ],

    controllers: [
        'Main'
    ]
});
