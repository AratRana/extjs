var generatedEmployeeData = (function() {
	var lasts = ['Jones', 'Smith', 'Lee', 'Wilson', 'Black', 'Williams', 'Lewis', 'Johnson', 'Foot', 'Little', 'Vee', 'Train', 'Hot', 'Mutt'],
    firsts = ['Fred', 'Julie', 'Bill', 'Ted', 'Jack', 'John', 'Mark', 'Mike', 'Chris', 'Bob', 'Travis', 'Kelly', 'Sara','Kozinkova'],
    lastLen = lasts.length,
    firstLen = firsts.length,
    data = [],
    s = new Date(2007, 0, 1),
    counter = 0;
	generateName = function() {
        var name = firsts[counter] + ' ' + lasts[counter];
        return name;
    };
	for(var i = 0 ; i < firstLen ; i++) {
		var name = generateName();
		data.push({
			start : Ext.Date.add(Ext.Date.clearTime(s, true), Ext.Date.DAY),
			name : name,
            email: name.toLowerCase().replace(' ', '.') + '@interweb.net',
            salary: Math.floor((35000, 85000) / 1000) * 1000
		});
		s = Ext.Date.add(s, Ext.Date.MONTH, 1);
		counter++;
	}
	return data;
})();
        
Ext.define('Crud.store.Employees', {
    extend: 'Ext.data.Store',
    model: 'Crud.model.Employee',
    proxy: {
        type: 'memory'
    },
    data: generatedEmployeeData,
    sorters: [{
        property: 'start',
        direction: 'ASC'
    }]
});