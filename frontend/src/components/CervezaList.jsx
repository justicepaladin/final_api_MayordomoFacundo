import React from 'react';
import CervezaItem from './CervezaItem';

function CervezaList({ cervezas }) {
    return (
        <div>
            {cervezas.map((cerveza) => (
                <CervezaItem key={cerveza.id} cerveza={cerveza} />
            ))}
        </div>
    )
}

export default CervezaList;